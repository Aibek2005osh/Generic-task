package java16.service.impl;

import java16.dao.AnimalImplDaoImpl;
import java16.models.Animal;
import java16.service.GenericSerice;

import java.util.List;

public class AnimalServiceImpl implements GenericSerice<Animal> {
    AnimalImplDaoImpl dao = new AnimalImplDaoImpl();
    @Override
    public String add(List<Animal> t) {

        return dao.add(t);
    }

    @Override
    public Animal getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<Animal> getAll() {
        return dao.getAll();
    }

    @Override
    public List<Animal> sortByName() {
        return dao.sortByName();
    }

    @Override
    public List<Animal> filterByGender() {
        return dao.filterByGender();
    }

    @Override
    public List<Animal> clear() {
        return dao.clear();
    }
}
