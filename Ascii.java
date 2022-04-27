import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        
        System.out.println("Enter a character:" );

        Scanner user = new Scanner(System.in);
        char c = user.next().charAt(0);
        int cast = (int) c;

user.close();
        System.out.println("Ascii value of " + c + " is: " + cast);
    }
}
