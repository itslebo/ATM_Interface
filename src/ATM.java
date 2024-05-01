import java.util.Scanner;

public class ATM {

    static double balance = 0;

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double checkBalance(){
        return balance;
    }
    
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        double amount;
        char repl;
        do {
            System.out.println("Which transaction would you like to perform today: \n 1. Deposit \n 2. Withdraw \n 3. Check Balances \n 4. Exit session");
            int act = sc.nextInt();
            switch (act) {
                case 1:
                    System.out.println("You chose to deposit today, what's your deposit amount");
                    amount = sc.nextInt();
                    atm.deposit(amount);   
                    System.out.println("Your balance is now " + balance);            
                    break;

                case 2:
                    System.out.println("You chose to deposit today, what's your deposit amount");
                    amount = sc.nextInt();
                    atm.withdraw(amount);
                    if(amount > balance){
                        System.out.println("Seems like your balance is low for this transaction.");
                    } else {
                        System.out.println("Your balance is now " + balance);  
                    }          
                    break;

                case 3:
                    System.out.println("You currently have " + balance + " in your account");
                    break;

                default:
                    System.out.println("Thank you for banking with us.");
                    break;
            }

            System.out.println("Would you like to perform another transaction? (y/n)");
            sc.nextLine();
            String reply = sc.nextLine();
            repl = reply.charAt(0);
        } while (repl == 'y');

        System.out.println("Thank you for banking with us.");
        System.out.println("Now exiting...");
        sc.close();
    }
}
