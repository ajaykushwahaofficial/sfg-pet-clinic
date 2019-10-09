package sfgpetclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.model.Vet;
import sfgpetclinicweb.servicces.OwnerService;
import sfgpetclinicweb.servicces.VetService;
import sfgpetclinicweb.servicces.map.OwnerMapService;
import sfgpetclinicweb.servicces.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerMapService ownerMapService,VetMapService vetMapService){
            this.ownerService = ownerMapService;
            this.vetService = vetMapService;

    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ajay");
        owner1.setLastNeme("Kushwaha");

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Rajesh");
        owner2.setLastNeme("Kumar");

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1=new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Rinki");
        vet1.setLastNeme("Sharma");

        Vet vet2=new Vet();
        vet2.setId(4L);
        vet2.setFirstName("Kishan");
        vet2.setLastNeme("Sharma");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.print("Data Loads");
    }
}
