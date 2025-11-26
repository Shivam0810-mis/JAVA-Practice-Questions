public class BankDetails {

    
    public static int calculateBalance(int deposit, int withdrawal) {
        return deposit - withdrawal;
    }

    public static void main(String[] args) {
        
        int user1Deposit = 5000;
        int user1Withdrawal = 2000;
        int user1Balance = calculateBalance(user1Deposit, user1Withdrawal);

        
        int user2Deposit = 100;
        int user2Withdrawal = 2500;
        int user2Balance = calculateBalance(user2Deposit, user2Withdrawal);

        
        int user3Deposit = 12000;
        int user3Withdrawal = 6000;
        int user3Balance = calculateBalance(user3Deposit, user3Withdrawal);

       
        System.out.println("User 1 BalanceRs: " + user1Balance);
        if(user2Balance<0){
            System.out.println("user2 Balance Rs:"+ user2Balance+ (" warning not enough balance: "));
        }else{
            System.out.println("User 2 BalanceRs: `" + user2Balance);
        }
        
        System.out.println("User 3 Balance Rs: " + user3Balance);
    }
}