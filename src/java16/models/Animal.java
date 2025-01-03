package java16.models;

import java16.enums.Gander;

public class Animal {
    private Long id;
    private String name;
    private int age;
    private Gander gender;

    private static Long genID = 1L;

    public Animal() {
        this.id = genID++;

    }

    public Animal( String name, int age, Gander gender) {
        this.id = genID++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gander getGender() {
        return gender;
    }

    public void setGender(Gander gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "     Animal    \n" +
               "id     : " + id +'\n'+
               "name   : " + name + '\n' +
               "age    : " + age +'\n'+
               "gender : " + gender +"\n\n"
               ;
    }
}
