
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line;
            line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
