import java.util.ArrayList;
import java.util.Scanner;

public class RegisterAccount{
  int accountNumber;
  double balance;
ArrayList<BankAccount>listOfClients=new ArrayList<>();
Scanner scanner=new Scanner(System.in);

    public void addAccount(){           
        
    listOfClients.add(new BankAccount(0, 0));
        System.out.println("Create your 7 digit account");
         accountNumber=scanner.nextInt();

        for(int i=0; i<listOfClients.size();i++){
            System.out.println(listOfClients.get(i).getAccountNumber());
        }
        
     }

     public void loggInToAccount(){
        System.out.println("Please enter your account number:");
        int enteredAccountNumber=scanner.nextInt();
        double balance=0;
        listOfClients.add(new BankAccount(enteredAccountNumber,balance));
        for (int i =0; i<listOfClients.size(); i++){
            if (listOfClients.get(i).getAccountNumber()==enteredAccountNumber)
            {
                MenuB ruMenuB =new MenuB();
                ruMenuB.menuB();
                

            }
             else{
            System.out.println("Account does not exist");
        }
        
     }
       }
   
}
