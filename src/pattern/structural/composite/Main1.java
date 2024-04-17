package pattern.structural.composite;

public class Main1 {
    public static void main(String[] args) {
        // 병사 생성
        Soldier soldier1 = new Soldier("KwonMo");
        Soldier soldier2 = new Soldier("MinJae");

        // 소대1,2 생성
        MilitaryComposite platoon1 = new MilitaryComposite("Platoon 1");
        platoon1.addSubUnit(soldier1);
        platoon1.addSubUnit(soldier2);

        Soldier soldier3 = new Soldier("TaeHwan");
        Soldier soldier4 = new Soldier("YoonIron");

        MilitaryComposite platoon2 = new MilitaryComposite("Platoon 2");
        platoon2.addSubUnit(soldier3);
        platoon2.addSubUnit(soldier4);

        // 중대 1,2 생성
        MilitaryComposite company1 = new MilitaryComposite("Company 1");
        company1.addSubUnit(platoon1);

        MilitaryComposite company2 = new MilitaryComposite("Company 2");
        company2.addSubUnit(platoon2);

        // 대대 생성
        MilitaryComposite battalion = new MilitaryComposite("Battalion");
        battalion.addSubUnit(company1);
        battalion.addSubUnit(company2);

        platoon1.removeSubUnit(soldier1);
        //battalion.removeSubUnit(soldier1); 삭제 안됨
        // 중앙 통제
        battalion.executeOrders();
    }
}
