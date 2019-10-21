package sfgpetclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.model.PetType;
import sfgpetclinicweb.model.Vet;
import sfgpetclinicweb.servicces.OwnerService;
import sfgpetclinicweb.servicces.PetTypeService;
import sfgpetclinicweb.servicces.VetService;
import sfgpetclinicweb.servicces.map.OwnerMapService;
import sfgpetclinicweb.servicces.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setFirstName("Ajay");
        owner1.setLastName("Kushwaha");

        Owner owner2=new Owner();
        owner2.setFirstName("Rajesh");
        owner2.setLastName("Kumar");

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1=new Vet();
        vet1.setFirstName("Rinki");
        vet1.setLastName("Sharma");

        Vet vet2=new Vet();
        vet2.setFirstName("Kishan");
        vet2.setLastName("Sharma");

        vetService.save(vet1);
        vetService.save(vet2);


        PetType petType=new PetType();
        petType.setName("Dog");

        PetType petType1=new PetType();
        petType.setName("Cat");

        petTypeService.save(petType);
        petTypeService.save(petType1);

        System.out.print("Data Loads");
    }
}
