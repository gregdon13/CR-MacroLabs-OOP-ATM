

public class Savings extends BankAccounts{
    Integer accountNumber = 000000;
    double annualInterestRate = 0.01;

    public boolean transferFromSavings(BankAccounts accTransferTo, double amountToTransfer) {
        boolean enoughFunds = false;
        double checkingBalance = checkBalance();
        if (checkingBalance > amountToTransfer) {
            accTransferTo.depositMoney(amountToTransfer);
            withdraw(amountToTransfer);
            transactionList.add("Transferred $" + amountToTransfer + " to " + accTransferTo + " from Savings");
            enoughFunds = true;
        }
        return enoughFunds;
    }

    public Integer createSavingsAccountNumber() {
        accountNumber = 333334 + (int) (Math.random() * ((666666 - 333334) + 1));
        return accountNumber;
    }

    public boolean accountNumAlreadyExist(Integer newAccountNum) {
        for (Integer accountNum : accountNumbersInUse) {
            if (accountNum != newAccountNum) {
                return false;
            }
        }
        return true;
    }

    public void setAccountNumber() {
        Integer accountNum = createSavingsAccountNumber();
        if (!accountNumAlreadyExist(accountNum)) {
            accountNumber = accountNum;
            accountNumbersInUse.add(accountNum);
        }
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void openSavingsAccount() {
        setAccountNumber();
        balance = 0.00;
        status = "Open";
    }

    public double annualMonthlyInterest(double balance){
        balance += (( annualInterestRate/ 12) *balance);
        return balance;
    }



    @Override
    public String toString() {
        return "Savings";
    }

//    public void withdrawFromSavings(double withdraw, double balance, BankAccounts investment) {
//        if (withdraw > balance ) {
//            double difference =  withdraw - balance;
//            zeroBalance();
//            investment.withdraw(difference);
//        }
//    }





}
