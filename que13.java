import java.util.*;
public class que13 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        
            char ch = st.charAt(0);
            int n = (int)ch;
            if(n>=97|| n<=122)
            {
                st = (char)(st.charAt(0)-32) + st.substring(1);
                System.out.println(st);

            }

            else
            {
                System.out.println(st);
            }
        
    }

}
