package pattern.behavioral.command.myExam;

import pattern.behavioral.command.myExam.convert.Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("계산기 입니다. 숫자 및 연산자(+-*/)를 입력 후 엔터를 쳐주세요.");
        System.out.println("뒤로가기 : z, 끝내기 : c");
        while (true){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().toLowerCase();

            switch (str){
                case "z" : converter.undo();
                        break;
                case "c" : return;
                default: converter.command(str);
            }
        }
    }
}
