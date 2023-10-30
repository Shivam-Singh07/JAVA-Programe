import java.util.*;
public class que10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 0;
        for(int i = 0;i<st.length();i=i+1)
        {
            char ch = st.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            {
                count = count+1;
            }
        }
        System.out.println("Number of vowels is :- "+count);
    }
}
