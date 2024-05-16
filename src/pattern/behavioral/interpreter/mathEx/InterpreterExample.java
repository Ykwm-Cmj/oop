package pattern.behavioral.interpreter.mathEx;

import java.util.HashMap;
import java.util.Map;

/**
 * Client
 * 표현식을 만들고 해석
 */
public class InterpreterExample {
    public static void main(String[] args) {
        Map<String, Integer> variables = new HashMap<>();
        variables.put("x", 5);
        variables.put("y", 7);

        Expression expression = new Plus(new Number(10), new Plus(new Number(20), new Number(30)));

        int result = expression.interpret(variables);
        System.out.println("Result: " + result);
    }
}
