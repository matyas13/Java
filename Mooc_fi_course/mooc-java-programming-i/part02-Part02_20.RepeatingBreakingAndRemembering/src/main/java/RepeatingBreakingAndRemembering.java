
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int cnt = 0;
        int even = 0;
        while (true) {
            int nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum += nr;
            cnt++;
            if (nr % 2 == 0) {
                even++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + cnt);
        System.out.println("Average of numbers: " + ((float)sum/cnt));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (cnt - even));
    }
}
