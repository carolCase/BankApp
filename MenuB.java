import java.util.Scanner;

public class MenuB {
     BankAccount bankAccount=new BankAccount(0, 0);
     Scanner scanner=new Scanner(System.in);
     Transactions transactions=new Transactions();
    

      public void menuB(){
          boolean runMenuB=true;
    
     do{   System.out.println("---Account menu----\n 1. Withdraw money\n 2. Deposit money\n 3. Show balance");
           int choice=scanner.nextInt();

        switch(choice){
        case 1: 
           // transactions.withdraw();
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
