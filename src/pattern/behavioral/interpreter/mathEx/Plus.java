package pattern.behavioral.interpreter.mathEx;

import java.util.Map;

/**
 * Non-terminal Expression
 * Expression 인터페이스를 구현하며, 두 개의 표현식을 포함하
 * interpret() 메서드를 통해 두 표현식을 해석하고 더한 결과를 반환
 */
public class Plus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Plus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

