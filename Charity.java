import java.util.Scanner;
public class Charity {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number of days:");
        int n=scanner .nextInt();
        int total_coins=0;
        for(int i =1 ; i<=n ; i++){
            total_coins +=i*i;
        }
        System.out.println("Adam will donate total coins:"+total_coins);
    }
}
