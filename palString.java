import java.util.Scanner;
public class palString 
{
    public static void main()
    {
        String s1="", s2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        s1=sc.next();
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
