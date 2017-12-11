package Kaiju;

import Vehicles.*;

public abstract class Kaiju {
    int healthValue;
    int attackValue;
    String name;
    String roar;

    public Kaiju(String name, int healthValue, int attackValue, String roar) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.roar = roar;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String getRoar() {
        return roar;
    }

    abstract String move(String string);

    abstract void attack(Vehicle string);

    public abstract void takeDamage(int damage);
}
