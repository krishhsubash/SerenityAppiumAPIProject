package serenity.utils;


import java.io.InputStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        BiConsumer<String,String> str = (s,a)-> {
            System.out.println(s.toUpperCase()+" "+ a.toUpperCase());
        };
        str.accept("Subash","Krishnappa");
        BiConsumer<String, String> work = (org,ID)-> {
          System.out.println("Work in "+org+" has emp ID: "+ID);
        };
        //work.accept("Sapient","142243");
        str.andThen(work).accept("Sapient","142243");
    }
}


