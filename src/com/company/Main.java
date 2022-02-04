package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

       Fish fish = new Fish();
       Parrot parrot = new Parrot();
       Cat cat = new Cat();
       Dog dog = new Dog();

       fish.setSpecies("BlackDrum");
       fish.setColor(Color.BLACK);
       fish.setSize("35 sm");

       parrot.setName("Colin");
       parrot.setAge((byte)3);
       parrot.setLanguages("English");
       parrot.setColor("white");
       parrot.setPrice(3000);

       cat.setSpecies("Breed");
       cat.setAge((byte)8);
       cat.setColor("brown");
       cat.setPrice(2500);

       dog.setAge((byte)10);
       dog.setColor("white");
       dog.setPrice(10000);
       dog.setSpecies("husky");

        System.out.println("The fish species: " + fish.getSpecies() + " " + ", color:" +
                fish.getColor() + ", size: " + fish.getSize());
        System.out.println("The parrot's name: " + parrot.getName() + ", age: " + parrot.getAge()
                + ", the parrot speaks " + parrot.getLanguages() + ", color " + parrot.getColor()
                + ", price " + parrot.getPrice());
        System.out.println("The cat's species " + cat.getSpecies() + ", color " + cat.getColor() +
                ", age: " +cat.getAge() + ", price " + cat.getPrice());
        System.out.println("The dog's species " + dog.getSpecies() + ", color " + dog.getColor() +
                ", age: " + dog.getAge() + ", price: " + dog.getPrice());

    }
}
