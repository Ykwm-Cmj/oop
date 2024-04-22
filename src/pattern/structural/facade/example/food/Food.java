package pattern.structural.facade.example.food;

public class Food {
    private String name;
    private boolean liquid;
    private int kcal;
    private String flavor;

    public Food(String name, boolean liquid, int kcal, String flavor){
        this.name = name;
        this.liquid = liquid;
        this.kcal = kcal;
        this.flavor = flavor;
    }
    public String getName() {return name;}
    public boolean isLiquid() {return liquid;}
    public int getKcal() {return kcal;}

    public String getFlavor() {return flavor;}
    public void setName(String name) {this.name = name;}
    public void setLiquid(boolean liquid) {this.liquid = liquid;}
    public void setKcal(int kcal) {this.kcal = kcal;}
    public void setFlavor(String flavor) {this.flavor = flavor;}
}
