public class BankAccount {
   
     private int accountNumber;   
     private  double balance;
     
     public BankAccount(int accountNumber, double balance){           
         this.accountNumber=accountNumber;
         this.balance=balance;
     }

     public int getAccountNumber() {
        return this.accountNumber;       
    }

    public void setAccountNumber(int newAccountNumber){
        this.accountNumber=newAccountNumber;
    }


     public double getBalance(){
        return this.balance;
     }

    public void setBalance(double newBalance){
        this.balance= newBalance;
    }


}
