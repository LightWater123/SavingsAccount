public class SavingsAccount 
{
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount(double balance)
    {
    balance = 0;

    }
    public  static void setInterestRate(double newRate)
    {
    interestRate = newRate;
    }
    public static double getInterestRate()
    {
        return interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount)
    {
        amount += balance;
    }
    public double withdraw(double amount)
    {
        if(balance >= amount )
        {
            amount -= balance;
        }else
        {
            amount = 0;
        }
        return amount;
    }
    public void addInterest(double interest)
    {
        balance *= interestRate;
        balance += interest;
    }
    public static void showBalance(SavingsAccount account)
    {
        account.getBalance();       
    }
    
    

}



