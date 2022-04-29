import java.util.Scanner;

public class Fibonaciiupto {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");


        Scanner user = new Scanner(System.in);
        int num = user.nextInt();

        System.out.println("Fibonacci series upto "+ num +":");

        int firstno= 0, secondno = 1;

        while(firstno < num){

            System.out.print(firstno + ", ");

            int nextno = firstno + secondno;
            firstno = secondno;
            secondno = nextno;
        }

        
        user.close();
    }
}
