public class Main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();

        myClass1.incrementInstanceCount();
        myClass2.incrementInstanceCount();
        myClass3.incrementInstanceCount();

        MyClass.incrementTotalCount();
        MyClass.incrementTotalCount();
        MyClass.incrementTotalCount();

        System.out.println(myClass1.toString());
        MyClass.incrementTotalCount();

        System.out.println(myClass2);
        MyClass.incrementTotalCount();

        System.out.println(myClass3.toString());

        System.out.println(Calculator.add(2,2));
        System.out.println(Calculator.subtraction(2,2));
        System.out.println(Calculator.multiplication(2,2));
        System.out.println(Calculator.division(2,2));
    }
}
