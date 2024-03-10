
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cnt = 0;
        int nr;
        while (true) {
            System.out.println("Give a number:");
            nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            }
            
            cnt++;
        }
        System.out.println("Number of numbers: " + cnt);
    }
}
