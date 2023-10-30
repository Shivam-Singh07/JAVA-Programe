import java.util.Scanner;

public class que17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n;
        long sum = 0;
        while(n>0)
        {
            long res = n % 10;
            sum = sum * 10 + res;
            n = n / 10;

        }
        System.out.println(sum);
        

    }
    
}
