


public class User {
   private String userName = "";
   private String password;
   private BankAccounts checkingAcct = new Checking();
   private BankAccounts savingsAcct = new Savings();
   private BankAccounts investmentAcct = new Investment();


   public User(String userName,  String password, BankAccounts checking, BankAccounts savings, BankAccounts investment) {
       this.userName = userName;
       this.checkingAcct = checking;
       this.savingsAcct = savings;
       this.investmentAcct = investment;
       this.password = password;
   }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword(){
       return password;
    }

//HEAD
    public BankAccounts getCheckingAcct() { return checkingAcct;}

    public void setCheckingAcct(BankAccounts checkingAcct) { this.checkingAcct = checkingAcct;}

    public BankAccounts getSavingsAcct() { return savingsAcct;}

    public void setSavingsAcct(BankAccounts savingsAcct) { this.savingsAcct = savingsAcct;}

    public BankAccounts getInvestmentAcct() { return investmentAcct;}

    public void setInvestmentAcct(BankAccounts investmentAcct) { this.investmentAcct = investmentAcct;}

}
