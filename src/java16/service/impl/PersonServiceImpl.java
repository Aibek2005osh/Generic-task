package java16.service.impl;

import java16.dao.PersonDaoImpl;
import java16.models.Person;
import java16.service.GenericSerice;

import java.util.List;

public class PersonServiceImpl implements GenericSerice <Person> {
 PersonDaoImpl personDao = new PersonDaoImpl();
    @Override
    public String add(List<Person> t) {
        return personDao.add(t) ;
    }

    @Override
    public Person getById(Long id) {
        return personDao.getById(id);
    }

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public List<Person> sortByName() {
        return personDao.sortByName();
    }

    @Override
    public List<Person> filterByGender() {
        return personDao.filterByGender();
    }

    @Override
    public List<Person> clear() {
        return personDao.clear();
    }
}
