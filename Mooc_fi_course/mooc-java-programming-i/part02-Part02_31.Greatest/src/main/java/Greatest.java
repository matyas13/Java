
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int ans = number1;
        if (number2 > ans) {
            ans = number2;
        }
        if (number3 > ans) {
            ans = number3;
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
