public class MyApp {
    public static void main(String[] args) {
        // Creating an Abstraction1 object
        // and configuring it with an Implementor1 object.
        Abstraction abstraction = new Abstraction1(new Implementor1());
        //Calling an operation on abstraction.
        System.out.println(abstraction.operationAbstr());
    }
}
