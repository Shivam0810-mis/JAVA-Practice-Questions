import java.util.Scanner;
public class GreatestDivisionFactor{
    public static int findGCD(int a, int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = sc. nextInt();
        System.out.println("enter second number:");
        int num2 = sc. nextInt();
        int gcd = findGCD(num1 , num2);
        System.out.println("greatest division factor" + num1 + "and" + num2 + "is" + gcd);

    }
}