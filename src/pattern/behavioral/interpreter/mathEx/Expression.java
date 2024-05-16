package pattern.behavioral.interpreter.mathEx;

import java.util.Map;

public interface Expression {
    //interpret() 메서드를 통해 각 표현식의 해석 방법을 정의
    int interpret(Map<String, Integer> variables);

}