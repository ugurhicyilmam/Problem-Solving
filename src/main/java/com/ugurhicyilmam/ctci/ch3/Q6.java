package com.ugurhicyilmam.ctci.ch3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

class Q6 {
    private LinkedList<Cage> cats = new LinkedList<>();
    private LinkedList<Cage> dogs = new LinkedList<>();
    private long counter = 0;
    
    private class Cage {
        private Animal animal;
        private Long number;

        Cage(Animal animal, long number) {
            this.animal = animal;
            this.number = number;
        }
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {
            cats.addFirst(new Cage(animal, counter));
        } else {
            dogs.addFirst(new Cage(animal, counter));
        }
        counter++;
    }

    public Animal dequeueCat() {
        return cats.removeLast().animal;
    }

    public Animal dequeueDog() {
        return dogs.removeLast().animal;
    }


    public Animal dequeueAny() {
        Cage dogCage = dogs.peekLast();
        Cage catCage = cats.peekLast();
        if (dogCage == null && catCage == null) {
            throw new NoSuchElementException();
        }
        if (catCage == null) {
            return dogs.removeLast().animal;
        }
        if (dogCage == null) {
            return cats.removeLast().animal;
        }
        if (dogCage.number < catCage.number) {
            return dogs.removeLast().animal;
        } else {
            return cats.removeLast().animal;
        }
    }

    abstract static class Animal {
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            this.setName(name);
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            this.setName(name);
        }
    }
}
