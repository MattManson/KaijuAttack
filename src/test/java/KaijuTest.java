import Kaiju.Godjirra;
import Kaiju.Mothra;
import Vehicles.Apache;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Godjirra godjirra;
    Mothra mothra;
    Tank tank;
    Apache apache;

    @Before
    public void before(){
        godjirra = new Godjirra("Godzilla", 4000, 250, "RAWR");
        mothra = new Mothra( "Mothra", 3600, 200, "REEEEE");
        tank = new Tank("Abrams", 500, 1000);
        apache = new Apache("Helicopter", 250, 750);
    }

    @Test
    public void canGetName(){
        assertEquals("Godzilla", godjirra.getName());
        assertEquals("Mothra", mothra.getName());
    }
    @Test
    public void canGetHealthValue(){
        assertEquals(4000, godjirra.getHealthValue());
        assertEquals(3600, mothra.getHealthValue());
    }
    @Test
    public void canGetAttackValue(){
        assertEquals(250 , godjirra.getAttackValue());
        assertEquals(300, mothra.getAttackValue());
    }
    @Test
    public void canGetRoar(){
        assertEquals("RAWR", godjirra.getRoar());
        assertEquals("REEEEE", mothra.getRoar());
    }
    @Test
    public void canGetVehicleType(){
        assertEquals("Abrams", tank.getType());
        assertEquals("Helicopter", apache.getType());
    }
    @Test
    public void canGetVehicleHealth(){
        assertEquals(500, tank.getHealth());
        assertEquals(250, apache.getHealth());
    }
    @Test
    public void canMove(){
        assertEquals("STOMP", godjirra.move("STOMP"));
        assertEquals("FLAP", mothra.move("FLAP"));
    }
    @Test
    public void canAttack(){
        godjirra.attack(tank);
        mothra.attack(apache);
        tank.attack(mothra);
        apache.attack(godjirra);
        assertEquals(250, tank.getHealth());
        assertEquals(50, apache.getHealth());
        assertEquals(2600, mothra.getHealthValue());
        assertEquals(3250, godjirra.getHealthValue());
    }


}
