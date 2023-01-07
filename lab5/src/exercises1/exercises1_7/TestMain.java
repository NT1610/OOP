package exercises1.exercises1_7;

public class TestMain {
    public static void main(String[] args) {
        MyComplex number1 = new MyComplex(1.1,2.2);
        MyComplex complex1 = new MyComplex(3.3,4.4);
        System.out.println(complex1);
        MyComplex complex2 = new MyComplex(1.92, 19);
        System.out.println(complex1.addInto(complex2));
        MyComplex newComplex = complex1.addNew(complex2);
        System.out.println(newComplex);
        System.out.println(complex1.magnitude());


    }
}
