import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SavingsTest {

    @Test
    public void depositSavings() {
        Savings savings = new Savings();
        savings.depositMoney(7.00);
        double expected = 7.00;

        double actual = savings.checkBalance();

        assertEquals(expected, actual);
    }

    @Test
    public void zeroBalance() {
        Savings savings = new Savings();
        savings.depositMoney(7.00);
        double expected = 0.00;

        savings.zeroBalance();
        double actual = savings.checkBalance();

        assertEquals(expected, actual);
    }

    @Test
    public void statusFrozen() {
        Savings savings = new Savings();
        savings.changeStatus("frOzEn");

        String expected = "FROZEN";
        String actual = savings.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void statusOpen() {
        Savings savings = new Savings();
        savings.changeStatus("OpeN");

        String expected = "OPEN";
        String actual = savings.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void withdrawal() {
        Savings savings = new Savings();
        savings.depositMoney(12.00);
        savings.withdraw(4.50);

        double expected = 7.50;
        double actual = savings.checkBalance();

        assertEquals(expected, actual);
    }

    @Test
    public void transferFromSavings() {
        Savings savings = new Savings();
        Investment investment = new Investment();
        savings.depositMoney(21.00);

        savings.transferFromSavings(investment, 5.62);

        assertEquals(15.38, savings.checkBalance());
    }

    @Test
    public void savingsAccountNumber() {
        Savings savings = new Savings();
        Integer accountNum = savings.createSavingsAccountNumber();

        assertTrue(accountNum >= 333334 && accountNum <= 666666);
    }

    @Test
    public void closeSavingsTrue() {
        Savings savings = new Savings();
        savings.depositMoney(65.81);

        assertFalse(savings.closeSavingsAccount());
    }

    @Test
    public void closeSavingsFalse() {
        Savings savings = new Savings();
        savings.depositMoney(21.36);
        savings.zeroBalance();

        assertTrue(savings.closeSavingsAccount());
    }
}
