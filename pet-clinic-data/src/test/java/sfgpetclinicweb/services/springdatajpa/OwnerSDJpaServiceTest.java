package sfgpetclinicweb.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.repositories.OwnerRepository;
import sfgpetclinicweb.repositories.PetRepository;
import sfgpetclinicweb.repositories.PetTypeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
    public static final String LAST_NAME = "Kushwaha";
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;
    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    Owner returnedOwner;
    @BeforeEach
    void setUp() {
        returnedOwner=Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        Owner returendOwner=Owner.builder().id(1L).lastName(LAST_NAME).build();
        when(ownerRepository.findByLastName(any())).thenReturn(returendOwner);
        Owner smith=ownerSDJpaService.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME,returendOwner.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnedOwnerSet=new HashSet<>();
        returnedOwnerSet.add(Owner.builder().id(1L).build());
        returnedOwnerSet.add(Owner.builder().id(2L).build());
        when(ownerRepository.findAll()).thenReturn(returnedOwnerSet);
        Set<Owner> ownerSet=ownerSDJpaService.findAll();
        assertNotNull(ownerSet);
        assertEquals(2,ownerSet.size());
    }

    @Test
    void save() {
        Owner newOwner=Owner.builder().id(1L).build();
        when(ownerRepository.save(any())).thenReturn(returnedOwner);
        Owner ownertoSave=ownerSDJpaService.save(newOwner);
        assertNotNull(ownertoSave);
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnedOwner));
        Owner owner=ownerSDJpaService.findById(1L);
        assertNotNull(owner);
        verify(ownerRepository).findById(anyLong());
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner=ownerSDJpaService.findById(1L);
        assertNull(owner);
    }

    @Test
    void deleteById() {
       ownerSDJpaService.deleteById(1L);
       verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void delete() {
        ownerSDJpaService.delete(returnedOwner);
        verify(ownerRepository).delete(any());
    }
}