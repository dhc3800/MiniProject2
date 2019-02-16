package com.dhc3800.mp2again;

public class Pokemon {

    private String name;
    private int id;
    private int defense;
    private int attack;
    private int hp;
    private String[] types;

    private int spatk;
    private int spdef;
    private int speed;
    private String species;
    private int total;
    private String flavorText;


    public Pokemon(String n, int id, int def, int atk, int hp, String[] t, int sa, int sd, int spe,
                   String spec, int tot, String fT) {
        this.name = n;
        this.id = id;
        this.defense = def;
        this.attack = atk;
        this.hp = hp;
        this.types = t;
        this.spatk = sa;
        this.spdef = sd;
        this.speed = spe;
        this.species = spec;
        this.total = tot;
        this.flavorText = fT;
    }

    public String[] getTypes() { return types; }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getHP() {
        return this.hp;
    }

    public String getFlavorText() {
        return this.flavorText;
    }

    public int getTotal() {
        return this.total;
    }

    public int getSpatk() { return this.spatk; }

    public int getSpdef() { return this.spdef; }

    public int getSpeed() { return this.speed; }

    public String getSpecies() { return this.species; }


}
