import java.util.Scanner;

public class Leapyear{

    public static void main(String[] args) {
        

        //Default value of boolean is false
        boolean leap = false;


        //Input a year from user
        System.out.println("Enter a year: ");

        
        //Input
        Scanner user = new Scanner(System.in);
        int year = user.nextInt();


        //Condition to check: if year % 4==0 bcz leap year comes in every 4 year 
        if(year % 4 == 0) {


            //Check given input is century year 
            if(year % 100 == 0) {


                /*if century year then for a leap yaer input should be completely divisible by 
                400*/
                if(year % 400 == 0) {

                    leap = true;

                }

                //Not divisional by 400 then condition false and not a leap year
                else {
                    leap = false;
                }
   
            }

            //if input not a century year then it is a leap year
            else {
                leap = true;
            }


            
        }

        //if input not completely divisible by 4 then not a leap year
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