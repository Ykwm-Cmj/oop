package pattern.behavioral.interpreter.parsingScriptEx;

public class MainEntry {
    public static void main(String[] args) {
        String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";
        System.out.println(script);

        Context context = new Context(script); // 구문 객체 생성
        Expression expression = new BeginExpression(); // 스크립트 파싱을 위한 객체 생성

        if(expression.parse(context)){
            System.out.println(expression);

            expression.run();
        }

//        String script = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";
//
//        Context context = new Context(script);
//
//        while(true){
//            String keyword = context.getCurrentKeyword();
//            if(keyword == null) break;
//
//            System.out.println(keyword);
//            context.readNextKeyword();
//        }
    }
}
