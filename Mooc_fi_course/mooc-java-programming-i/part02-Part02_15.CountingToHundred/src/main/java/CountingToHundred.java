
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = Integer.parseInt(scanner.nextLine());
        
        for(int i=nr; i<=100; i++) {
            System.out.println(i);
        }
    }
}
