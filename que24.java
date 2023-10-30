import java.util.*;
public class que24 
{
    public static boolean armstrong(long n)
    {
        long a = n;
        long b = a;
        long count = 0;
        while(n > 0)
        {
            count = count + 1;
            n = n/10;
        }
        long sum = 0;
        for(int i = 0;i<count;i=i+1)
        {
            long digit = a % 10;
            sum = (long)Math.pow(digit,count) + sum;
            a = a / 10;

        }
        if(sum == b)
        return true;

        else
        return false;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(armstrong(n));
    }
    
}
