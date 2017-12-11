package Vehicles;

import Kaiju.*;

public abstract class Vehicle {
    String type;
    int healthValue;
    public int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return healthValue;
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Kaiju string);
}
