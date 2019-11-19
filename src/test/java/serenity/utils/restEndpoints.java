package serenity.utils;

interface restEndpoint {
    default void m1() {
        m2();
        System.out.println("Executing default method");
    }
    default void m3() {
        m2();
        System.out.println("Executing defalt m3 method");

    }
    public static void m2() {
        System.out.println("Common function");
    }
}

public class restEndpoints implements restEndpoint{
    public static void main(String[] args) {
        restEndpoints r = new restEndpoints();
        restEndpoint.m2();
    }
}
