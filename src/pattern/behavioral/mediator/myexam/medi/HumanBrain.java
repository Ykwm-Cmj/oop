package pattern.behavioral.mediator.myexam.medi;

import pattern.behavioral.mediator.myexam.component.Arm;
import pattern.behavioral.mediator.myexam.component.Heart;
import pattern.behavioral.mediator.myexam.component.HumanSkin;
import pattern.behavioral.mediator.myexam.component.Leg;

public class HumanBrain implements Brain {
    private Heart heart = new Heart();
    private Arm arm = new Arm();
    private Leg leg = new Leg();
    private HumanSkin skin;
    @Override
    public void avoid() {
        heart.morePump();
        arm.handOff();
        leg.back();
        arm.shakeBackAndForth();
    }

    public void setSkin(HumanSkin skin) {
        this.skin = skin;
    }
}
