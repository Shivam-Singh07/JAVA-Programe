import java.util.*;
public class que6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i = 0;i<s.length();i=i+1)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                str = str + Character.toLowerCase(s.charAt(i));
            }
            
            else if(Character.isLowerCase(s.charAt(i)))
            {
                str = str + Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(str);
    }
}
