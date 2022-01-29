import java.util.Scanner;
public class WordCount
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        int words=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                words++;
            }
        }
        System.out.println("No. of words in sentence: " + words);
    }
}
