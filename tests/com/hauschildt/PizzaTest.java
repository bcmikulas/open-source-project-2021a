package com.hauschildt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        fail();
    }

    @Test
    void setName() {
        fail();
    }

    @Test
    void getPrice() {
        fail();
    }

    @Test
    void setPrice() {
        fail();
    }

    @Test
    void getDescription() {
        fail();
    }

    @Test
    void setDescription() {
        fail();
    }

    @Test
    void getSize() {
        fail();
    }

    @Test
    void setSize() {
        fail();
    }

    @Test
    void getCrust() {
        assertEquals(Pizza.DEFAULT_CRUST, pizza.getCrust());

    }

    @Test
    void setCrustWithGoodData() {

        pizza.setCrust(Crust.ORIGINAL);
        assertEquals(Pizza.DEFAULT_CRUST, pizza.getCrust());

    }

    @Test
    void getSauce() {
        fail();
    }

    @Test
    void setSauce() {
        fail();
    }

    @Test
    void getMeat() {
        fail();
    }

    @Test
    void setMeat() {
        fail();
    }

    @Test
    void getVeggies() {
        fail();
    }

    @Test
    void setVeggies() {
        fail();
    }

    @Test
    void testToString() {
        fail();
    }
}