package pattern.behavioral.command.myExam.convert;

import pattern.behavioral.command.myExam.commandEnum.CommandEnum;

import java.util.Map;
import java.util.Stack;

public class Converter {
    private Stack<String> history = new Stack<>();
    private static Map<String, String> opper = Map.of("+","ADD", "-", "MINUS", "/", "DIV", "*","MUL");

    public void command(String str){
        if(opper.containsKey(str)){ // 연산자 일때
            if(!history.isEmpty() && opper.containsKey(history.peek())){
                history.pop();
            }
            history.push(str);
        }else if(str.chars().allMatch(Character::isDigit)){ // 숫자 일때
            String temp;
            if(history.size() > 1 && opper.containsKey(history.peek())){
                String opp = history.pop();
                String num = history.pop();
                temp = CommandEnum.valueOf(opper.get(opp)).call(num, str);
            }else{
                temp = str;
            }
            history.push(temp);
            System.out.println(temp);
        }
    }

    public void undo(){
        if(history.isEmpty()){
            return;
        }

        String str = null;
        while(!history.isEmpty()){
            str = history.pop();
            if(!opper.containsKey(str)){
                break;
            }
        }

        if (str != null){
            System.out.println(str);
            history.push(str);
        }
    }
}
