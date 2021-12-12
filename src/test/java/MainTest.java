import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

    Lamp lamp;

    @Before
    public void sebelumMulai() {
        lamp = new Lamp(false, false);
        lamp.lampOn();
        lamp.lampAutoOn();
        System.out.println("Test Dimulai");
    }

    @Test
    public void testLampOn() {
        assertTrue(lamp.isOn());
    }

    @Test
    public void testAutoOn() {
        assertTrue(lamp.isAuto());
    }

    @Test
    public void testLampOff() {
        lamp.lampOff();
        assertFalse(lamp.isOn());
    }

    @Test
    public void testAutoOff() {
        lamp.lampAutoOff();
        assertFalse(lamp.isAuto());
    }

    @Test
    public void testLampOn2() {
        lamp.lampOff();
        assertTrue(lamp.isOn());
    }

    @After
    public void selesaiTest() {
        System.out.println("Test Selesai");
    }
}