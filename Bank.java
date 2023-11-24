import java.util.Scanner;

class BankAccount{
    private int accNum;
    private String holdersName;
    private float accBal;

    public BankAccount(int Num, String Name, float Bal)
    {
        this.accBal = Bal;
        this.accNum = Num;
        this.holdersName = Name;
    }

    public double getAccountBalance() {
        return accBal;
    }

    public void setAccountBalance(float newBal) {
        if (newBal >= 0) 
        {
            accBal = newBal;
        } 
        else 
        {
            System.out.println("Invalid! Negative initial balance. Setting balance to 0.");
            accBal = 0;
        }
    }

    public void deposit(float amt)
    {
        this.accBal = this.accBal + amt;
        System.out.println("New Balance = " + this.accBal);
    }

    public void withdraw(float amt)
    {
        if(amt <= this.accBal)
        {
            this.accBal = this.accBal - amt;
            System.out.println("New Balance = " + this.accBal);
        }
        else{
            System.out.println("Insufficient Balance! " + this.accBal + " can't be withdrawn.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder's Name: " + holdersName);
        System.out.println("Account Balance: $" + accBal);
    }
}

public class Bank{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BankAccount myAccount = new BankAccount(12345, "Izza Naseer", 1000);

        System.out.print("Enter the amount you want to deposit: ");
        float amount = sc.nextInt();

        myAccount.deposit(amount);

        System.out.print("Enter the amount you want to withdraw: ");
        amount = sc.nextInt();

        myAccount.withdraw(amount);
    }
}