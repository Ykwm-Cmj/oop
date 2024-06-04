package pattern.behavioral.templateMethod.enums;

import java.util.function.Function;

public enum EatEnum {
    HAND(str -> str + "으로 집어서", "손"),
    SPOONE(str -> str + "로 떠서", "수저"),
    FORK(str -> str + "로 찍어서", "포크"),
    CHOPSTICKS(str -> str + "으로 집어서", "젓가락");
    private final Function<String,String> function;
    private final String name;

    EatEnum(Function<String, String> function, String name) {
        this.function = function;
        this.name = name;
    }

    public String eat(){
        return function.apply(name);
    }
}
