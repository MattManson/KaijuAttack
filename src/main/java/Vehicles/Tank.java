package Vehicles;
import Kaiju.*;

public class Tank extends Vehicle {
    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    @Override
    public void takeDamage(int damage) {
        healthValue -= damage;
    }

    @Override
    public void attack(Kaiju kaiju) {
        kaiju.takeDamage(this.attackValue);
    }

}
