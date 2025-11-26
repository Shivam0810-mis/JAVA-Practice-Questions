import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1 = scanner.nextInt();
        System.out.println("enter your second number:");
        int num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println("num1 is greater");
        }else if (num2>num1){
            System.out.println("num2 is greater");
        }else{
            System.out.println("both are equal");
        }

        
    }
}
