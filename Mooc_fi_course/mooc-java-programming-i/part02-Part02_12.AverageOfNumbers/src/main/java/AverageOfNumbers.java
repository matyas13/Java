
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cnt = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            }
            
            cnt++;
            sum += nr;
        }
        
        System.out.println("Average of the numbers: " + ((float)sum/cnt));
    }
}
