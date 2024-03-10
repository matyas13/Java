
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum =0;
        int nr;
        while (true) {
            System.out.println("Give a number:");
            nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            }
            
            sum += nr;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
