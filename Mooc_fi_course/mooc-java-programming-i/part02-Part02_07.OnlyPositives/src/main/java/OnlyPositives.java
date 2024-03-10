
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nr;
        
        while (true) {
            System.out.println("Give a number:");
            nr = Integer.parseInt(scanner.nextLine());
            
            if (nr == 0) {
                break;
            } else if (nr < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(nr * nr);
            }
        }
    }
}
