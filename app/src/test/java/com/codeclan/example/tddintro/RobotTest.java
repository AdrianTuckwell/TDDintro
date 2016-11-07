package com.codeclan.example.tddintro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class RobotTest {

    Robot robot;

    @Before
    public void before(){
        robot = new Robot("C3PO", "Gold");
    }

    @Test
    public void testRobotSetup(){
        assertEquals("C3PO", robot.getName());
        assertEquals("Gold", robot.getColour());
    }

    @Test
    public void testCheckBattery(){
        assertEquals(100.0, robot.checkBattery(),0.01);
    }

    @Test
    public void testMakeDrink(){
        assertEquals("I am making tea", robot.makeDrink("tea"));
        assertEquals(90.0, robot.checkBattery(),0.01);
    }

    @Test
    public void testWashDishes(){
        assertEquals("I am washing the dishes", robot.washDishes());
        assertEquals(70.0, robot.checkBattery(),0.01);
    }

    @Test
    public void testDoDusting(){
        assertEquals("I am dusting", robot.doDusting());
        assertEquals(80.0, robot.checkBattery(),0.01);
    }

    @Test
    public void testrechargeBattery(){
        robot.doDusting();
        robot.rechargeBattery();
        assertEquals(100.0, robot.checkBattery(),0.01);
    }

}
