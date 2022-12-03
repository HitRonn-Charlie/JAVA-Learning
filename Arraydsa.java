public class Arraydsa {
    public static void main(String[] args) {

        int newArray[]; // Declare Array

        newArray = new int[8]; // Initialize array of 8 int


        System.out.println(newArray); // Array without data

        //Condition to store element
        //Operation:Insertion data

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Adding " + i + "at the index " + i);
            newArray[i] = i;         //Insert i value at ith index in newArray
            
        }

        System.out.println(newArray);


    }
}
