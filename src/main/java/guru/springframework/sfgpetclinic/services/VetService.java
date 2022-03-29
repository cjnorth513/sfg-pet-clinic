package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;

import java.util.Set;

public abstract class VetService implements CrudService{

    private VetRepository vetRepository;

    @Override
    public Set<Vet> findAll() {
        return (Set<Vet>) vetRepository.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
