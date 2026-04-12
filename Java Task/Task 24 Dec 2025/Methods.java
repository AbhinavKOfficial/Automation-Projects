class MethodTypes {

    void showMessage() {
        System.out.println("This is a non-static method");
    }

    static void displayMessage() {
        System.out.println("This is a static method");
    }

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }

    void greet() {
        System.out.println("Hello, Welcome to Java!");
    }

    public static void main(String[] args) {

        MethodTypes obj = new MethodTypes();

        obj.showMessage();
        obj.add(10, 20);
        obj.greet();

        MethodTypes.displayMessage();

        int result = obj.multiply(5, 4);
        System.out.println("Multiplication Result: " + result);
    }
}
