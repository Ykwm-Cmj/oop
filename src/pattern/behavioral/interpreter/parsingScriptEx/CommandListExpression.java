package pattern.behavioral.interpreter.parsingScriptEx;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListExpression implements Expression{
    private ArrayList<CommandExpression> commands
                = new ArrayList<CommandExpression>();

    @Override
    public boolean parse(Context context) {
       while(true){
           String currentKeyword = context.getCurrentKeyword();

           if(currentKeyword == null){
               return false;
           } else if(currentKeyword.equals("END")){
               context.readNextKeyword();
               break;
           } else{
               // 해당 구문에 맞는 객체 생성
               CommandExpression command = null;

               // 루프 문자열인지 Action 문자열인지 확인 후 객체 생성
               if(LoopCommandExpression.checkValidKeyword(currentKeyword)){
                   command = new LoopCommandExpression(currentKeyword);
               }else if(ActionCommandExpression.checkValidKeyword(currentKeyword)){
                   command = new ActionCommandExpression(currentKeyword);
               }

               if(command != null){
                   if(command.parse(context)){
                       commands.add(command);
                   } else{
                       return false;
                   }
               }else {
                   return false;
               }
           }
       }

       return true;
    }

    @Override
    public boolean run() {
        Iterator<CommandExpression> iter = commands.iterator();

        while(iter.hasNext()){
            boolean bOK = iter.next().run();
            if(!bOK) return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return commands.toString();
    }
}
