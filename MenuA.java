import java.util.Scanner;

    public class MenuA{
   
     private Scanner scanner=new Scanner(System.in);
     private RegisterAccount registerAccountNumber= new RegisterAccount();
    

       public void menuA(){
        boolean runMenuA=true;

    do{
       System.out.println("****Main menu****\n 1. Create an account\n 2. Logg in to your account\n 3. Exit");
       int choice=scanner.nextInt();
       

        switch(choice){
          case 1: registerAccountNumber.addAccount();
          break;
          case 2: registerAccountNumber.loggInToAccount();
          break;
          case 3: runMenuA=false;
          System.out.println("Good bye!");
          break;
        }
        
    }while(runMenuA);
}
    }
