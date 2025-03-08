import java.util.*;
class ATM{

    float Balance;
    int PIN=1234;

    public void checkPIN(){
        do {
            System.out.println("Enter your PIN: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();

            if (enteredpin == PIN) {
                menu();
                return;
            }
            else
                System.out.println("Invalid PIN");
        }while (true);
    }

    public void menu() {
        do {
            System.out.println("1. Check Account Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");
            System.out.println("Enter your choice");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter a valid choice");
            }
        }while(true);
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>Balance)
            System.out.println("Insufficient Balance");
        else {
            Balance=Balance-amount;
            System.out.println("Money Withdrawl Sucessful");
        }
    }

    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully");
    }
}
public class ATMMachine {
    public static void main(String[] args)
    {
        ATM obj=new ATM();
        obj.checkPIN();
    }
}
