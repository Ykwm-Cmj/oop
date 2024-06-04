package pattern.behavioral.templateMethod.utils;

import java.util.function.Supplier;

public class Template {
    public static void eat(String what, Supplier<String> how){
        System.out.println(what + "을/를");
        System.out.println(how.get());
        System.out.println("먹는다");
    }
}
