
public class Account {
    private double balance;
    private int pin;
    
   public Account(double balance, int pin){
       this.balance = balance;
       this.pin = pin;
   }
   public boolean validatePin(int enteredPin){
       return pin == enteredPin;
   }
   public double getBalance() {
       return balance;
   }
   public void deposit(double amount){
       if(amount > 0){
           balance += amount;
           System.out.println("₹" + amount + "deposited successfully.");
       }
   }
   public boolean withdraw(double amount){
       if(amount > 0){
           balance -= amount;
           System.out.println("₹" + amount + "withdrawn successfully.");
                 return true;
       }
       return false;
   }
}
