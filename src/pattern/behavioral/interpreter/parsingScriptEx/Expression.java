package pattern.behavioral.interpreter.parsingScriptEx;

public interface Expression {
    boolean parse(Context context); // 컨텍스트가 제공하는 구문이 올바른지 확인
    boolean run();
}
