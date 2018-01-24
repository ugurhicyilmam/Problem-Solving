package com.ugurhicyilmam.ctci.ch3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class Q6Test {

    private Q6 shelter;

    @Before
    public void setUp() throws Exception {
        Q6.Cat cat1 = new Q6.Cat("first");
        Q6.Cat cat2 = new Q6.Cat("second");
        Q6.Dog dog1 = new Q6.Dog("first");
        Q6.Dog dog2 = new Q6.Dog("second");
        shelter = new Q6();
        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
    }

    @Test
    public void dequeueDog() throws Exception {
        assertEquals("first", shelter.dequeueDog().getName());
        assertEquals("second", shelter.dequeueDog().getName());
    }

    @Test
    public void dequeueCat() throws Exception {
        assertEquals("first", shelter.dequeueCat().getName());
        assertEquals("second", shelter.dequeueCat().getName());
    }

    @Test
    public void dequeueAny() throws Exception {
        Q6.Animal animal1 = shelter.dequeueAny();
        assertEquals("first", animal1.getName());
        assertThat(animal1, instanceOf(Q6.Cat.class));

        Q6.Animal animal2 = shelter.dequeueAny();
        assertEquals("second", animal2.getName());
        assertThat(animal2, instanceOf(Q6.Cat.class));

        Q6.Animal animal3 = shelter.dequeueAny();
        assertEquals("first", animal3.getName());
        assertThat(animal3, instanceOf(Q6.Dog.class));

        Q6.Animal animal4 = shelter.dequeueAny();
        assertEquals("second", animal4.getName());
        assertThat(animal4, instanceOf(Q6.Dog.class));
    }

}