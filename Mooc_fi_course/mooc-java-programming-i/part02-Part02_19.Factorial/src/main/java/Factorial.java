
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        
        int p = 1;
        for(int i = 2; i <= n; i++) {
            p *= i;
        }
        System.out.println("Factorial: " + p);
    }
}
