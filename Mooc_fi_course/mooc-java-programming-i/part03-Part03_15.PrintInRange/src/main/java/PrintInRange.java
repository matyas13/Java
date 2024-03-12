
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current >= lowerLimit && current <= upperLimit) {
                System.out.println(current);
            }
        }
    }
    
}
