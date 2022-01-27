class Constructor {

    String languages;

    //Parameterized Constructor

     Constructor(String lang) {
languages = lang;
System.out.println(languages + " Programming language");

    }

public static void main(String[] args) {

   Constructor obj1 = new Constructor("Java");
   Constructor obj2 = new Constructor("Python");

}

}
