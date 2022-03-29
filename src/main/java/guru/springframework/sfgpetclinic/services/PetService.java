package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Specialty;

import java.util.Set;

public interface PetService extends CrudService{
    @Override
    public Set findAll() {
        return null;
    }

    @Override
    public Object findById(Object o) {
        return null;
    }

    @Override
    public Object save(Specialty object) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteById(Object o) {

    }
}
