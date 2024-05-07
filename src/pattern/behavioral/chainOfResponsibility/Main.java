package pattern.behavioral.chainOfResponsibility;

import pattern.behavioral.chainOfResponsibility.deploy.Deploy;
import pattern.behavioral.chainOfResponsibility.deploy.DeployTestHandler;
import pattern.behavioral.chainOfResponsibility.deploy.RegistHandler;
import pattern.behavioral.chainOfResponsibility.deploy.TotalTestHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        // 자바 라이브러리의 예시
        Logger logger = Logger.getLogger("test");
        logger.log(Level.INFO, "test message");

        RegistHandler registHandler = new RegistHandler();
        TotalTestHandler totalTestHandler = new TotalTestHandler();
        DeployTestHandler deployTestHandler = new DeployTestHandler();


        registHandler
                .setNext(totalTestHandler)
                .setNext(deployTestHandler);
        Deploy deploy = new Deploy(registHandler);

        deploy.deploy();
    }
}
