
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = -1;
        int cnt = 0;
        int sum = 0;
        String name = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            
            String[] words = line.split(",");
            cnt++;
            sum = sum + Integer.valueOf(words[1]);
            int len = words[0].length();
            if (len > longest) {
                longest = len;
                name = words[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double)sum/cnt));
    }
}
