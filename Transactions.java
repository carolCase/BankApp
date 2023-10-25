

import java.util.ArrayList;
import java.util.Scanner;

public class Transactions{
   ArrayList<BankAccount>listOfClients;
   private BankAccount bankAccount;
   
   Scanner scanner=new Scanner(System.in);


   public Transactions(ArrayList<BankAccount> listOfClients, BankAccount bankAccount) {
      this.listOfClients = listOfClients;
      this.bankAccount = new BankAccount(0, 0);
  }
  
   
      public void withdraw() {
   
      System.out.println("Money? " + bankAccount.getBalance());
      System.out.println("Enter amount to withdraw:");
     
     double amount = scanner.nextDouble();
       
if (amount > bankAccount.getBalance()){

  System.out.println("You dont have enough on your account");
} 
else {
          double newBalance=bankAccount.getBalance()-amount;
       bankAccount.setBalance(newBalance);
       System.out.println("Your new balance is " + bankAccount.getBalance());
     
  
   }
}
     
   
   
   public void deposit(){
      
      System.out.println("Enter the amount to deposit: ");
      double amount = scanner.nextDouble();

      double currentBalance=bankAccount.getBalance();
      double newBalance=currentBalance+amount;
      bankAccount.setBalance(newBalance);

      System.out.println("your balance after deposit is: "+ newBalance);
   }

   
   
    public void showAccountBalance() {
       double currentBalance=bankAccount.getBalance();
       System.out.println(currentBalance);
     }

    


   }




