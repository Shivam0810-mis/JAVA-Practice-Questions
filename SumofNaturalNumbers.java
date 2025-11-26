public class SumofNaturalNumbers
{
    public static int calculateSum(int n)
    {
        if (n<=0)
        {
            return 0;
        }
        else{
            return +calculateSum(n-1);
        }
    }
    public static void main (String []args)
    {
        int n=5;
        int sum =calculateSum(5);
        System.out.println("The sum of the first"+n+"natural numbers is:"+sum);
    }
}