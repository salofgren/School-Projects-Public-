public class BankAccount{
    private double balance;
    private double annualInterestRate;
    private int totalDeposits;
    private int totalWithdraws;

    //Constructor
    public BankAccount(double balance, double annualInterestRate){
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //Sets the annual interest rate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate; 
    }
    //Adds the amount to the balance and calculates the total deposits
    public void deposit(double amount){
        balance += amount; 
        totalDeposits ++; 
    }
    //Subtracts the amount from the balance and calculates the total withdraws
    public void withdraw(double amount){
        balance -= amount; 
        totalWithdraws ++; 
    }
    //Calculates the total interest and adds the monthly interest to the balance 
    public void payMonthlyInterest(){
        double monthlyInterest = balance * getMonthlyInterestRate();
        balance += monthlyInterest; 
    }
    //Get account balance
    public double getBalance(){
        return balance; 
    }
    //Get annual interest rate
    public double getAnnualInterestRate(){
        return annualInterestRate; 
    }
    //Get monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12; 
    }
    //Get total deposits
    public int getTotalDeposits(){
        return totalDeposits; 
    }
    //Get total withdraws
    public int getTotalWithdraws(){
        return totalWithdraws; 
    }
}