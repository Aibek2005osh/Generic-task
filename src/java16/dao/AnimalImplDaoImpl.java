package java16.dao;

import java16.db.Database;
import java16.enums.Gander;
import java16.models.Animal;
import java16.models.Person;
import java16.service.GenericSerice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AnimalImplDaoImpl implements GenericSerice<Animal> {
    @Override
    public String add(List<Animal> animals) {
        Database.animals.addAll(animals);
        return "success";

    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : Database.animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        System.out.println("Animal not found");
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return Database.animals;
    }

    @Override
    public List<Animal> sortByName() {
        System.out.println("Sorting by name");
        System.out.println("press to 1. ascending | or | 2.descending ");
        System.out.print("comanda : ");
        int a = new Scanner(System.in).nextInt();
    switch (a){
        case 1 ->{
            Database.animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

        }case 2->{
            Database.animals.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
        }
    }

        return List.of();
    }

    @Override
    public List<Animal> filterByGender() {
        System.out.println("sorting by gender");
        System.out.println("press to 1. male | or | 2.female ");
        System.out.print("comanda : ");

        int a = new Scanner(System.in).nextInt();
        List<Animal> animals =new ArrayList<>();
        switch (a){
            case 1 ->{
                for (Animal animal : Database.animals) {
                    if (animal.getGender().equals(Gander.MALE)) {
                        animals.add(animal);
                    }

                }
            }
            case 2 ->{
                for (Animal animal : Database.animals) {
                    animal.getGender().equals(Gander.FEMALE);
                    animals.add(animal);
                }
            }
        }

        return animals;
    }

    @Override
    public List<Animal> clear() {
        Database.animals.clear();
        return List.of();
    }
}
