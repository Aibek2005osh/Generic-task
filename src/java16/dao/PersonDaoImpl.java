package java16.dao;

import java16.db.Database;
import java16.enums.Gander;
import java16.models.Person;
import java16.service.GenericSerice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonDaoImpl implements GenericSerice<Person> {
    @Override
    public String add(List<Person> persons) {
        Database.persons.addAll(persons);
        return "SUCCESS";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : Database.persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return Database.persons;
    }

    @Override
    public List<Person> sortByName() {
        System.out.println("Sort by name");
        System.out.println("Press to 1. ascending | or | descending");
        System.out.print("comanda : ");
        int a = new Scanner(System.in).nextInt();
        switch (a){
            case 1 ->{
                Database.persons.sort(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getName().compareTo(o2.getName());

                    }
                });
            }case 2 ->{
                Database.persons.sort(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                });
            }
        }
        return Database.persons;
    }

    @Override
    public List<Person> filterByGender() {
        System.out.println("Filter by Gender");
        System.out.println("Press to 1. male | or | 2. female ");
        System.out.println("comanda");
        int a = new Scanner(System.in).nextInt();
        List<Person> personList= new ArrayList<>();
        switch (a){
            case 1 ->{
                for (Person person : Database.persons) {
                    if (person.getGender().equals(Gander.MALE)) {

                        personList.add(person);
                    }

                }


            }case 2 ->{
                for (Person person : Database.persons) {
                    if (person.getGender().equals(Gander.FEMALE)){
                        personList.add(person);
                    };


                }

            }
        }
        return personList;
    }

    @Override
    public List<Person> clear() {
        Database.persons.clear();
        return List.of();
    }
}
