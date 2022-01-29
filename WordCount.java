import java.util.Scanner;
public class WordCount
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input=sc.nextLine();
        int words=1;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) == ' ')
            {
                words++;
            }
        }
        System.out.println("No. of words in sentence: " + words);
    }
}
