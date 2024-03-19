
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String name = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            
            String[] words = line.split(",");
            
            int age = Integer.parseInt(words[1]);
            if (age > oldest) {
                oldest = age;
                name = words[0];
            }
        }
        System.out.println("Name of the oldest " + name);
    }
}
