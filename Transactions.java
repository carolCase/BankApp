

import java.util.Scanner;

public class Transactions{
   BankAccount bankAccount =new BankAccount(0, 0);
RegisterAccount registerAccount=new RegisterAccount();
  Scanner scanner=new Scanner(System.in);

    double amount;
    double currentBalance;
   
    
    
     public double withdraw(Scanner scanner, double amount) {
     System.out.println("Enter amount to withdraw:");
     amount = scanner.nextDouble();
       
if (amount> bankAccount.getBalance()){
   return amount-bankAccount.getBalance(); } 
         else {
    System.out.println("You dont have enough on your account");
      }
      return bankAccount.getBalance();
   }
     
   
   
   public double deposit(Scanner scanner, double amount){
      System.out.println("Enter the amount to deposit: ");
      amount = scanner.nextDouble();
      
      System.out.println(" " + amount + " has been deposited to your account.");
      return amount=+bankAccount.getBalance();
    }

   
   
    public double showAccountBalance(double currentBalance) {
       currentBalance=amount+bankAccount.getBalance();
       return currentBalance;
     }

    


   }




