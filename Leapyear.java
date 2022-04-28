import java.util.Scanner;

public class Leapyear{

    public static void main(String[] args) {
        
        boolean leap = false;

        //Input a year from user

        System.out.println("Enter a year: ");

        

        Scanner user = new Scanner(System.in);

        int year = user.nextInt();

        if(year % 4 == 0) {

            if(year % 100 == 0) {

                if(year % 400 == 0) {

                    leap = true;

                }

                else {
                    leap = false;
                }

            }

            else {
                leap = true;
            }


        }

        else {
            leap = false;
        }

        user.close();

        if(leap ) {

            System.out.println(year + " is a Leap Year.");

        }

        else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
}