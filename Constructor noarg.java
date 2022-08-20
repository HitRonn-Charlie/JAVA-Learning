class Constr {

    String name;

    // Constructor

    Constr() {
        name = "Constructor";

    }

    public static void main(String[] args) {
        // Creating object in same class

        Constr obj = new Constr();
        System.out.println("I am " + obj.name);

    }
}
