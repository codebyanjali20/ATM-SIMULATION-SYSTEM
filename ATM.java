import java.util.Scanner;
public class ATM {
    private Account account;
    private Scanner sc;
    public ATM(Account account){
        this.account = account;
        sc = new Scanner(System.in);
    }
    public void start() {
        System.out.println("=====ATM SYSTEM=====");
        int attempt = 3;
        boolean authenticated = false;
        while (attempt > 0){
            System.out.println("Enter PIN: ");
            int pin = sc.nextInt();
            if(account.validatePin(pin)) {
                authenticated = true;
            break;
        } else {
                attempt--;
                System.out.println("Incorrect PIN!");
                }
    }
    if (!authenticated){
    System.out.println("Account Locked!");
    return;
}
    int choice;
    do { 
    System.out.println("\n====MENU====");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    choice = sc.nextInt();
    switch (choice) {
        case 1:
      System.out.println("Current Balance: ₹" + account.getBalance());
              break;
        case 2:
      System.out.println("Enter amount to deposit: ");
      double depositeAmount = sc.nextDouble();
      account.deposit(depositeAmount);
              break;
        case 3:
            System.out.println("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            if (!account.withdraw(withdrawAmount)){
                System.out.println("Insufficient Balance!");
            } 
            break;
        case 4:
            System.out.println("Thank you for using ATM.");
            break;
        default:
            System.out.println("invalid Choice!");
            } 
    } while(choice !=4);
}
}