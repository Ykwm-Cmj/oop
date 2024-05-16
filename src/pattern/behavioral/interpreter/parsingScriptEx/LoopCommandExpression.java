package pattern.behavioral.interpreter.parsingScriptEx;

public class LoopCommandExpression extends CommandExpression {
    private int count; // 몇번 반복했는지
    private CommandListExpression expression; // 구문

    public LoopCommandExpression(String keyword) {
        super(keyword);
    }

    @Override
    public boolean parse(Context context) {
        if(!checkValidKeyword(keyword)) return false;

        String countKeyword = context.readNextKeyword();
        if(countKeyword == null) return false;

        try {
            // 카운트 키워드 정수 변환
            count = Integer.parseInt(countKeyword);

            // 정수로 변환 후 객체 생성
            expression = new CommandListExpression();
            if(context.readNextKeyword() == null) return false;

            return expression.parse(context);

        } catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean checkValidKeyword(String keyWord){
        return keyWord.equals("LOOP");
    }

    @Override
    public boolean run() {
        for(int i =0; i<count; i++){
            if(!expression.run()){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "LOOP(" + count + ")" + expression;
    }
}
