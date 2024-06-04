package pattern.behavioral.templateMethod;

import pattern.behavioral.templateMethod.enums.EatEnum;

import static pattern.behavioral.templateMethod.utils.Template.eat;

public class Demo {
    public static void main(String[] args) {
        /*
        * 템플릿 메서드의 기본은 상속을 통해서 구현하지만
        * enum과 메서드 참조를 통해 더 간결하게 변경해봄
        * */
        eat("사과", EatEnum.CHOPSTICKS::eat);
        System.out.println("========================");
        System.out.println();
        eat("고기", EatEnum.FORK::eat);
        System.out.println("========================");
        System.out.println();
        eat("스프", EatEnum.valueOf("SPOONE")::eat);
        System.out.println("========================");
        System.out.println();
        eat("비빔밥", () -> "젓가락으로 섞고 수저롤 떠서");
    }
}
