package Kaiju;

import Vehicles.Vehicle;

public class Mothra extends Kaiju {

    public Mothra(String name, int healthValue, int attackValue, String roar) {
        super(name, healthValue, attackValue, roar);
    }

    public String move(String string) {
        return string;
    }

    @Override
    public void attack(Vehicle vehicle) {
        vehicle.takeDamage(this.attackValue);
    }

    @Override
    public void takeDamage(int damage) {
        healthValue -= damage;
    }
}
