import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingTests {

    @Test
    public void depositChecking() {
        //Given
        Checking checking = new Checking();
        checking.depositMoney(10.00);
        double expected = 10.00;

        //When
        double actual = checking.checkBalance();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void zeroBalance() {
        //Given
        Checking checking = new Checking();
        checking.depositMoney(10.00);
        checking.zeroBalance();
        double expected = 0.00;

        //When
        double actual = checking.checkBalance();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void statusFrozen() {
        Checking checking = new Checking();
        checking.changeStatus("Frozen");

        String expected = "FROZEN";
        String actual = checking.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void statusOpen() {
        Checking checking = new Checking();
        checking.changeStatus("oPeN");

        String expected = "OPEN";
        String actual = checking.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void withdrawal() {
        Checking checking = new Checking();
        checking.depositMoney(10.00);
        checking.withdraw(5.00);

        double expected = 5.00;
        double actual = checking.checkBalance();

        assertEquals(expected, actual);
    }
}
