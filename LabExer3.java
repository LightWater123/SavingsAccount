import java.util.*;

public class LabExer3 {

    
    
    public static void RunSavingsAccount (String[]args)
    {
        Scanner s = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount(0);

        System.out.println("Enter interest rate: ");
        savings.addInterest(0);s.nextDouble();
        System.out.println("Enter deposit amount: ");
        savings.deposit(0);;s.nextDouble();

        System.out.println("Press D for another deposit or W to withdraw: ");
        char decision = s.next().charAt(0);
        if (decision == 'd' || decision == 'D')
        {
            savings.deposit(decision);
        }
        else if (decision == 'w' || decision == 'W')
        {
            savings.withdraw(decision);
        }else
        {
            System.out.println("Choose D or W");
        }

        System.out.println("Your new balance is: "+ savings.getBalance());
    }

}
