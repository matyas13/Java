
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cnt = 0;
        int sum = 0;
        while (true) {
            int nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            }
            
            if (nr > 0) {
                cnt++;
                sum += nr;
            }
        }
        
        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((float)sum/cnt);
        }
    }
}
