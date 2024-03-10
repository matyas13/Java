
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nr = Integer.parseInt(scanner.nextLine());
        
        if (nr < 0) {
            nr *= -1;
        }
        
        System.out.println(nr);
    }
}
