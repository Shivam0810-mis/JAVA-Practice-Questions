import java.util.Scanner;
public class HappyNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        while(number!=1 && number!=4){
            int sum = 0;
            while(number>0){
                int digit = number%10;
                sum += digit*digit;
                number/=10;
            }
            number = sum;
        }
        if(number == 1){
            System.out.println("Given number is a happy number:");
        }else{
            System.out.println("Given number is not a happy number:");
        }
    }
}
