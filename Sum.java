import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");

        Scanner user = new Scanner(System.in);
        int number = user.nextInt();

        int sum = 0;

        for(int i = 1; i<= number; i++) {

            sum = sum + i;
        }

        user.close();

        System.out.println("Sum = " + sum);
    }
}
