package pattern.behavioral.command.myExam.commandEnum;

import pattern.behavioral.command.guruExam.command.Command;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public enum CommandEnum {
    ADD((a,b) -> String.valueOf(Long.parseLong(a) + Long.parseLong(b))),
    MINUS((a,b) -> String.valueOf(Long.parseLong(a) - Long.parseLong(b))),
    DIV((a,b) -> String.valueOf(BigDecimal.valueOf(Long.parseLong(a)).divide(BigDecimal.valueOf(Long.parseLong(b))))),
    MUL((a,b) -> String.valueOf(Long.parseLong(a) * Long.parseLong(b)));
    private final BiFunction<String, String, String> func;

    CommandEnum(BiFunction<String, String, String> func) {
        this.func = func;
    }

    public String call(String a, String b){
        return func.apply(a, b);
    }
}
