import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term:");
        int num = sc.nextInt();
        int first =0,  second =1;
        System.out.println("fibonacci series upto term:" + num + "terms");
        for(int i = 1 ; i<=num ; i++){
           System.out.println(first + "");
           int next = first + second;
           first = second;
           second = next;
        }
    }
    
}
