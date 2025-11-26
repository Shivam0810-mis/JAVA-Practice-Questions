class BankAccount {
    double balance = 1000;
void deposit (int amount)
{
    balance += amount;
    showBalance();
}
void withDraw(int amount)
{
    balance -= amount;
    showBalance ();
}
void showBalance()
{
    System.out.println(balance);
}
    
}
public class BankAc{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        acc.withDraw(200);

    }
}    








