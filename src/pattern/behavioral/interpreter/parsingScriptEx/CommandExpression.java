package pattern.behavioral.interpreter.parsingScriptEx;

public abstract class CommandExpression implements Expression {
    // 자신이 처리해야할 구문에 대한 문자열을 담음
    protected String keyword;

    public CommandExpression(String keyword){
        this.keyword = keyword;
    }
}
