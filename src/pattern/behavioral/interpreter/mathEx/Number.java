package pattern.behavioral.interpreter.mathEx;

import java.util.Map;

/**
 * Terminal Expression
 * 숫자를 나타내는 표현식으로, 더 이상 분해할 수 없는 최소 단위의 표현식
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return number;
    }
}
