package guru.springframework.javaspring_petclinic.bootstrap;

import guru.springframework.javaspring_petclinic.model.Owner;
import guru.springframework.javaspring_petclinic.model.Vet;
import guru.springframework.javaspring_petclinic.services.OwnerService;
import guru.springframework.javaspring_petclinic.services.VetService;
import guru.springframework.javaspring_petclinic.services.map.OwnerServiceMap;
import guru.springframework.javaspring_petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {


//            PetType dog = new PetType();
//            dog.setName("Dog");
//            PetType savedDogPetType = petTypeService.save(dog);
//
//            PetType cat = new PetType();
//            cat.setName("Cat");
//            PetType savedCatPetType = petTypeService.save(cat);
//
//            Speciality radiology = new Speciality();
//            radiology.setDescription("Radiology");
//            Speciality savedRadiology = specialtyService.save(radiology);
//
//            Speciality surgery = new Speciality();
//            surgery.setDescription("Surgery");
//            Speciality savedSurgery = specialtyService.save(surgery);
//
//            Speciality dentistry = new Speciality();
//            dentistry.setDescription("dentistry");
//            Speciality savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
