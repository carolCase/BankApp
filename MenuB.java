import java.util.Scanner;

public class MenuB {
    
     Scanner scanner=new Scanner(System.in);
     Transactions transactions=new Transactions(null);
     BankAccount bankAccount=new BankAccount(0, 0);


      public MenuB(Transactions transactions, BankAccount bankAccount) {
      this.transactions = transactions;
      this.bankAccount = bankAccount;
  }

   

      public MenuB() {
    }



    public void menuB(){
          boolean runMenuB=true;
    
     do{   System.out.println("---Account menu----\n 1. Withdraw money\n 2. Deposit money\n 3. Show balance");
           int choice=scanner.nextInt();

        switch(choice){
        case 1: 
                transactions.withdraw();
        break;
        case 2: transactions.deposit();       
         break;
        case 3:
                transactions.showAccountBalance();
        break;
        }

      }while(runMenuB);
    }


}
