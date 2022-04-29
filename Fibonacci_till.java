import java.util.Scanner;

public class Fibonacci_till{
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");

        Scanner user = new Scanner(System.in);
        int num = user.nextInt();

        System.out.println("Fibonacci series till "+ num +":");

        int firstno= 0, secondno = 1;

        for(int i=1; i<=num; i++){

            System.out.print(firstno + ", ");

            int nextno = firstno + secondno;
            firstno = secondno;
            secondno = nextno;
        }

        user.close();
    }
}