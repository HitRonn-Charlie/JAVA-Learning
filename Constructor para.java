class Constructor {

    String languages;

    //Parameterized Constructor

    Constructor(String lang) {
        languages = lang;
        System.out.println(languages + " Programming language");

    }

    public static void main(String[] args) {

        new Constructor("Java");
        new Constructor("Python");

    }

}
