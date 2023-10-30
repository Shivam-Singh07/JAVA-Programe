import java.util.*;
public class que3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a = 0;

        if(s1.length() != s2.length())
        {
            System.out.println("false");
        }

        else
        {
            for(int i = 0;i<s1.length();i=i+1)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    a = 1;
                }
            }
        }

        if(a == 0)
        System.out.println("true");

        else
        System.out.println("false");
    }
}
