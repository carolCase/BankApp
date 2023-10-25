import java.util.ArrayList;
import java.util.Scanner;

public class RegisterAccount{
  int accountNumber;
  
ArrayList<BankAccount>listOfClients=new ArrayList<>();
Scanner scanner=new Scanner(System.in);

    public void addAccount() {           
  System.out.println("Create your 7 digit account");
  accountNumber=scanner.nextInt();
  
  listOfClients.add(new BankAccount(accountNumber, 0.0));

   for(int i=0; i<listOfClients.size();i++){
    System.out.println(listOfClients.get(i).getAccountNumber());
    }
    }

     
public void loggInToAccount(){
    System.out.println("Please enter your account number:");
    int enteredAccountNumber=scanner.nextInt();
   
    for (int i =0; i<listOfClients.size(); i++){
 if (listOfClients.get(i).getAccountNumber()==enteredAccountNumber)
     {
        MenuB runMenuB =new MenuB();
        runMenuB.menuB();
     }

     else{System.out.println("Account does not exist");}
    }
     }
}
