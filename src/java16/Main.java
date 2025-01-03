package java16;

import java16.enums.Gander;
import java16.models.Animal;
import java16.models.Person;
import java16.service.impl.AnimalServiceImpl;
import java16.service.impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static PersonServiceImpl personService = new PersonServiceImpl();
    static AnimalServiceImpl animalService = new AnimalServiceImpl();
    static Person person1 = new Person();

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    PRESS TO 1. PERSON
                    PRESS TO 2. ANIMAL
                    PRESS TO 3. EXIT
                    
                    """);
            System.out.print("comand : ");
            int i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            PRESS TO 1. ADD PERSON
                            PRESS TO 2. GET BY ID
                            PRESS TO 3. GET ALL PERSONS
                            PRESS TO 4. SORT BY NAME PERSONS
                            PRESS TO 5. FILTER BY GANDER PERSONS
                            PRESS TO 6. CLEAR PERSONS
                            PRESS TO 7. EXIT
                            
                            """);
                    System.out.print("comand : ");
                    i = sc.nextInt();
                    switch (i) {
                        case 1 -> {
                            System.out.println(personService.add(add1()));
                        }

                        case 2 -> {
                            System.out.print("id : ");
                            Long l = sc2.nextLong();
                            System.out.println(personService.getById(l));
                        }
                        case 3 -> {
                            System.out.println(personService.getAll());
                        }
                        case 4 -> {
                            System.out.println(personService.sortByName());
                        }
                        case 5 -> {
                            System.out.println(personService.filterByGender());
                        }
                        case 6 -> {
                            System.out.println(personService.clear());
                        }
                        case 7 -> {
                            return;
                        }
                    }

                }
                case 2 -> {
                    System.out.println("""
                            PRESS TO 1. ADD ANIMAL
                            PRESS TO 2. GET BY ID
                            PRESS TO 3. GET ALL ANIMALS
                            PRESS TO 4. SORT BY NAME ANIMALS
                            PRESS TO 5. FILTER ANIMALS
                            PRESS TO 6. CLEAR ANIMALS
                            PRESS TO 7. EXIT
                            """);
                    System.out.print("comand : ");
                    i = sc.nextInt();
                    switch (i) {
                        case 1 -> {
                            System.out.println(animalService.add(add2()));
                        }
                        case 2 ->{
                            System.out.print("id : ");
                            Long l = sc2.nextLong();
                            System.out.println(animalService.getById(l));
                        }
                        case 3 -> {
                            System.out.println(animalService.getAll());
                        }
                        case 4 -> {
                            System.out.println(animalService.sortByName());
                        }
                        case 5 -> {
                            System.out.println(animalService.filterByGender());

                        }
                        case 6 -> {
                            System.out.println(animalService.clear());
                        }
                        case 7 ->{
                            return;
                        }
                    }

                }
            }

        }

    }

    public static List<Person> add1() {
        List<Person> persons = new ArrayList<>();
        System.out.print("kancha person  koshosuz : ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("name : ");
            String s = sc2.nextLine();
            System.out.print("age : ");
            int age = sc.nextInt();
            System.out.print("gender male 1.  : female 2. : ");
            int gender1 = new Scanner(System.in).nextInt();
            Gander gander2 = null;
            if (gender1 == 1) {
                gander2 = Gander.MALE;
            } else if (gender1 == 2) {
                gander2 = Gander.FEMALE;
            }
            persons.add((new Person(s, age, gander2)));

        }
        return persons;
    }

    public static List<Animal> add2() {
        List<Animal> animals = new ArrayList<>();
        System.out.print("kancha animal koshosuz : ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("name : ");
            String s = sc2.nextLine();
            System.out.print("age : ");
            int age = sc.nextInt();
            System.out.print("gender male 1.  : female 2. : ");
            int gender1 = new Scanner(System.in).nextInt();
            Gander gander2 = null;
            if (gender1 == 1) {
                gander2 = Gander.MALE;

            } else if (gender1 == 2) {
                gander2 = Gander.FEMALE;


            }
            animals.add((new Animal(s, age, gander2)));

        }
        return animals;
    }

}