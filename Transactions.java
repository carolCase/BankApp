

import java.util.ArrayList;
import java.util.Scanner;

public class Transactions{
   ArrayList<BankAccount>listOfClients;
   BankAccount bankAccount = new BankAccount(0, 0);
   Scanner scanner=new Scanner(System.in);


   public Transactions(ArrayList<BankAccount> listOfClients, BankAccount bankAccount) {
      this.listOfClients = listOfClients;
      this.bankAccount = bankAccount;
  }
    public Transactions(BankAccount bankAccount2) {
   }
   public void menuB(){}
 

     public double withdraw() {
      double amount;
     System.out.println("Enter amount to withdraw:");
     amount = scanner.nextDouble();
       
if (amount>=bankAccount.getBalance()){
       double newBalance=bankAccount.getBalance()-amount;
       bankAccount.setBalance(newBalance);
       return amount;
} 
else {
     System.out.println("You dont have enough on your account");
     return 0;
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




