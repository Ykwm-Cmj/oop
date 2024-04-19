package pattern.structural.decorator.myexample.deco.recipe;

public class Ingredient implements RamenRecipe {
    private Ingredient next;
    String name, how;
    public Ingredient(String name, String how){
        this.name = name;
        this.how = how;
    }

    public Ingredient(IngredientEnum e) {
        this.name = e.name;
        this.how = e.how;
    }

    @Override
    public void cook() {
        System.out.println(name + how);
        if (next == null){
            System.out.println("완성!");
            return;
        }
        next.cook();
    }

    @Override
    public <T extends Ingredient> void next(T next) {
        Ingredient temp = this;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = next;
    }

}
