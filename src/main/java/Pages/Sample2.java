package Pages;

class Sample extends Sample2 {
    public void method() {

        System.out.println("Inside Sample");
    }

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}


class A extends Sample2 {
    public void method() {
        System.out.println("Inside sample A");
    }

}
public class Sample2 {
    public void method() {
        System.out.println("inside sample2");
    }
}
