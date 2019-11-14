package sfgpetclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinicweb.model.*;
import sfgpetclinicweb.servicces.*;
import sfgpetclinicweb.servicces.map.SpecialitiesMapService;
import sfgpetclinicweb.servicces.map.VisitMapService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesMapService;
    private final VisitService visitMapService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesMapService, VisitService visitMapService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesMapService = specialitiesMapService;
        this.visitMapService = visitMapService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setFirstName("Ajay");
        owner1.setLastName("Kushwaha");
        owner1.setAddress("Khora");
        owner1.setCity("Delhi");
        owner1.setTelephone("9650452232");

        PetType type1=new PetType();
        type1.setName("Dog");
        petTypeService.save(type1);

        Pet mikePet=new Pet();
        mikePet.setName("Moti");
        mikePet.setPetType(type1);
        mikePet.setBirthDate(LocalDate.now());
        mikePet.setOwner(owner1);

        owner1.getPets().add(mikePet);

        Owner owner2=new Owner();
        owner2.setFirstName("Rajesh");
        owner2.setLastName("Kumar");
        owner2.setAddress("Khora1");
        owner2.setCity("Delhi11");
        owner2.setTelephone("9650452235");

        PetType type2=new PetType();
        type2.setName("Cat");
        petTypeService.save(type2);

        Pet mikePetCat=new Pet();
        mikePetCat.setName("Pussy");
        mikePetCat.setPetType(type2);
        mikePetCat.setBirthDate(LocalDate.now());
        mikePetCat.setOwner(owner2);
        owner2.getPets().add(mikePetCat);

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1=new Vet();
        vet1.setFirstName("Rinki");
        vet1.setLastName("Sharma");

        Speciality speciality1=new Speciality();
        speciality1.setDescription("Heart");
        Speciality spec1=specialitiesMapService.save(speciality1);
        vet1.getSpecialities().add(spec1);


        Vet vet2=new Vet();
        vet2.setFirstName("Kishan");
        vet2.setLastName("Sharma");


        Speciality speciality2=new Speciality();
        speciality2.setDescription("Bone");
        Speciality spec2=specialitiesMapService.save(speciality2);
        vet2.getSpecialities().add(spec2);

        vetService.save(vet1);
        vetService.save(vet2);


        PetType petType=new PetType();
        petType.setName("Dog");

        PetType petType1=new PetType();
        petType.setName("Cat");

        petTypeService.save(petType);
        petTypeService.save(petType1);


        Visit visit1=new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setDescription("Dog Bimar h");
        visit1.setPet(mikePet);


        System.out.print("Data Loads");
    }
}
