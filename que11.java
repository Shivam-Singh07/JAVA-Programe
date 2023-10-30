import java.util.*;
public class que11 
{
    public static String duplicate(String str)
    {
        if(str == null || str.length() == 0)
        {
            return str;
        }

        
        
            StringBuilder result = new StringBuilder();
            char prev = str.charAt(0);
            result.append(prev);
            for (int i=1;i<str.length();i++)
            {
                char curr = str.charAt(i);
                if(curr != prev)
                {
                    result.append(curr);
                    prev = curr;
                }
            }
        
        return result.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(duplicate(str));
        
    }
    
}
