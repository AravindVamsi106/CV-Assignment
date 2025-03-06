import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length())
            System.out.println("false");
        
        else 
        {

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            if (Arrays.equals(ch1, ch2))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
