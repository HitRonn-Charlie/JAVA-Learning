class Hello{

    int i = 5;

    void Comp() {

        if(i>0) {

            System.out.println("True");
        }
    }

    void num() {

        System.out.println("Number is: " + i);
    }

     public static void main(String[] args) {
        
    
    Hello obj = new Hello();
    obj.Comp();

    Hello no = new Hello();
    no.num();

    }
}