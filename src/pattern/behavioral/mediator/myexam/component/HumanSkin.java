package pattern.behavioral.mediator.myexam.component;

import pattern.behavioral.mediator.myexam.medi.HumanBrain;

public class HumanSkin implements Skin {
    private HumanBrain brain;

    public HumanSkin(HumanBrain brain) {
        this.brain = brain;
        brain.setSkin(this);
    }

    @Override
    public void touch(boolean temp) {
        if(!temp){
            brain.avoid();
            return;
        }
        System.out.println("가만히 있음");
    }
}
