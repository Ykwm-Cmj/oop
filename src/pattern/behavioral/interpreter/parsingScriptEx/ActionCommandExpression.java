package pattern.behavioral.interpreter.parsingScriptEx;

public class ActionCommandExpression extends CommandExpression{
    public ActionCommandExpression(String keyword) {
        super(keyword);
    }

    @Override
    public boolean parse(Context context) {
        // 자신이 처리해야할 구문이 맞는지 확인
        if(!checkValidKeyword(keyword)) return false;

        // 다음구문 확인시 null이면 false
        if(context.readNextKeyword() == null) return false;

        // 올바르게 처리됐으면 true반환
        return true;
    }

    public static boolean checkValidKeyword(String keyword) {
        // 아래 문자열 중 하나인지를 확인
        boolean bKeywordOk = keyword.equals("FRONT") ||
                keyword.equals("BACK") || keyword.equals("LEFT") ||
                keyword.equals("RIGHT");

        return bKeywordOk;
    }

    @Override
    public boolean run() {
        System.out.println("cmd : " + keyword);
        return true;
    }

    @Override
    public String toString() {
        return keyword;
    }
}
