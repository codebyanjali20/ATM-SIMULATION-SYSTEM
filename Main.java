
public class Main {
    public static void main(String[] args){
        Account account = new Account(10000,1234);
        Account acc1 = new Account(10000, 1234);
        Account acc2 = new Account(20000, 5678);
        Account acc3 = new Account(15000, 4321);
        ATM atm = new ATM(account);
        atm.start();
    }
}
