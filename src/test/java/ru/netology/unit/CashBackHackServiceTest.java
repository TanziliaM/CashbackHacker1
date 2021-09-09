package ru.netology.unit;



import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldByeAmountCurrent() {
        int amount = 6200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldBye0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBye1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldByeIncorrect() {
        int amount = -1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);


    }
}
