

public class DivisibleByThree {

    public static void main(String[] args) {

        divisibleByThreeInRange(1, 6);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        
        for (int i = (beginning % 3 ==0 ? beginning : (beginning + (3 - beginning % 3))); i <= end; i += 3) {
            System.out.println(i);
        }
    }

}
