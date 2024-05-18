package pattern.behavioral.mediator;

import pattern.behavioral.mediator.myexam.component.HumanSkin;
import pattern.behavioral.mediator.myexam.medi.HumanBrain;

import java.lang.reflect.Method;
import java.util.Timer;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
        /* 코어 Java 라이브러리의 Mediator 패턴 예시 */
//        Timer timer = new Timer();
//        timer.schedule();
//        Executor.execute()1
//        Method method = new Method();
//        method.invoke()
        HumanBrain brain = new HumanBrain();
        HumanSkin skin = new HumanSkin(brain);
        skin.touch(true);
        System.out.println("=============================");
        skin.touch(false);
    }
}
