import java.util.Scanner;
public class palString 
{
    public static void main()
    {
        String input="", pal="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        input=sc.next();
        for(int i=input.length()-1;i>=0;i--)
        {
            pal+=input.charAt(i);
        }
        if(input.equals(pal))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
