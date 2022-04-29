import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        
        System.out.println("Enetr a number: ");


        //User input
        Scanner user = new Scanner(System.in);
        int num = user.nextInt();

        //using long

        long factorial = multiplyNumber(num);
        System.out.println("Factorial of "+ num + " is: " + factorial);

        user.close();
    }

    public static long multiplyNumber(int num ) {
        if(num >=1)

            return num * multiplyNumber(num - 1);
        else
        return 1;


    }
    
}