import java.util.*;

public class LabExer3 {

    
    
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount(0);

        System.out.println("Enter interest rate: ");
        savings.addInterest(0);s.nextDouble();
        System.out.println("Enter deposit amount: ");
        savings.deposit(s.nextDouble());
        System.out.println("Your Balance is: "+ savings.getBalance());

        System.out.println("Press D for another deposit or W to withdraw: ");
        char decision = s.next().charAt(0);
        if (decision == 'd' || decision == 'D') 
        {
            System.out.println("Enter deposit amount: ");
            savings.deposit(s.nextDouble());
        }
        else if (decision == 'w' || decision == 'W')
        {
            System.out.println("Enter amount to withdraw: ");
            savings.withdraw(s.nextDouble());
        }else
        {
            System.out.println("Choose D or W");
        }

        System.out.println("Your new balance is: "+ savings.getBalance());
    }

}
