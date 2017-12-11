package Kaiju;
import Vehicles.*;

public class Godjirra extends Kaiju{


    public Godjirra(String name, int healthValue, int attackValue, String roar) {
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

