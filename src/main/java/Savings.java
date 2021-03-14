public class Savings extends BankAccounts{
    Integer accountNumber;

    public boolean transferFromSavings(BankAccounts accTransferTo, double amountToTransfer) {
        boolean enoughFunds = false;
        double checkingBalance = checkBalance();
        if (checkingBalance > amountToTransfer) {
            accTransferTo.depositMoney(amountToTransfer);
            withdraw(amountToTransfer);
            enoughFunds = true;
        }
        return enoughFunds;
    }

    public Integer createSavingsAccountNumber() {
        accountNumber = 333334 + (int) (Math.random() * ((666666 - 333334) + 1));
        /*
        if accountNumber is equal to that of one in archives, generate again
        recursion here? Call itself until it gets a unique number?
         */
        return accountNumber;
    }

    public void openSavingsAccount() {
        accountNumber = createSavingsAccountNumber();
        balance = 0.00;
    }

    public boolean closeSavingsAccount() {
        boolean isClosed = false;
        if (checkBalance() == 0.00) {
            changeStatus("Closed");
            isClosed = true;
        }
        return isClosed;
    }
}
