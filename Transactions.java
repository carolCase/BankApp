

import java.util.ArrayList;
import java.util.Scanner;

public class Transactions{
   ArrayList<BankAccount>listOfClients=new ArrayList<>();
   BankAccount bankAccount =new BankAccount(0, 0);
   RegisterAccount registerAccount=new RegisterAccount();
  Scanner scanner=new Scanner(System.in);

    double amount;
    double currentBalance;
    double balanceAfterDeposit;
   
    
    
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
     
   
   
   public void deposit(){
      
      System.out.println("Enter the amount to deposit: ");
      amount = scanner.nextDouble();
      double currentBalance=bankAccount.getBalance();
      double newBalance=currentBalance+amount;
      listOfClients.add(new BankAccount(0, newBalance));
      System.out.println("your balance after deposit is: "+ newBalance);
   }

   
   
    public void showAccountBalance() {
       currentBalance=bankAccount.getBalance();
       System.out.println(currentBalance);
     }

    


   }




