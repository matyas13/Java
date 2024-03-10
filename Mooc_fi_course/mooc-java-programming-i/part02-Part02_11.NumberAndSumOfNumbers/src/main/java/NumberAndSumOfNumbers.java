
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum =0;
        int cnt =0;
        int nr;
        while (true) {
            System.out.println("Give a number:");
            nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            }
            
            cnt++;
            sum += nr;
        }
        System.out.println("Number of numbers: " + cnt);
        System.out.println("Sum of the numbers: " + sum);
    }
}
