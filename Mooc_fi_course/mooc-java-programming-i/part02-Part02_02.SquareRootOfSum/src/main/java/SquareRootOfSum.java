
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nr1 = Integer.parseInt(scanner.nextLine());
        int nr2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println(Math.sqrt(1.0*(nr1 + nr2)));
    }
}
