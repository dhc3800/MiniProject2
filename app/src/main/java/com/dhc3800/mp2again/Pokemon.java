package com.dhc3800.mp2again;

public class Pokemon {
    private int id;
    private String name;

    public Pokemon(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }


}
