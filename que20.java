import java.util.*;
public class que20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        String str = String.valueOf(n);
        String str1 = str.replace('5','0');
        long a = Long.parseLong(str1);
        System.out.println(a);

    }
    
}
