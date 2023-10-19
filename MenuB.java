import java.util.Scanner;

public class MenuB {

     private Scanner scanner=new Scanner(System.in);
     Transactions transactions=new Transactions();
    

      public void menuB(){
          boolean runMenuB=true;
    
     do{   System.out.println("---Account menu----\n 1. Withdraw money\n 2. Deposit money\n 3. Show balance");
           int choice=scanner.nextInt();

        switch(choice){
        case 1: 
            transactions.withdraw(scanner, double);
        break;
        case 2: transactions.deposit(scanner, double);
        break;
        case 3: 
            transactions.showAccountBalance(double);
        break;
        }

      }while(runMenuB);
    }


}
