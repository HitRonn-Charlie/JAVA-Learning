class Arraysum{

public static void main (String[] args) {

    int[] numbers = {12,13,15,26,30,55};


    // Sum of Array
int sum = 0;
for (int number : numbers){

    sum += number;

    
}

// Array Length
int arrayLength = numbers.length;
System.out.println("Array length: " + arrayLength);


double average;
average = ((double)sum / (double)arrayLength);

System.out.println("Average: " + average);
System.out.println("Sum: " + sum);






    

    }
}