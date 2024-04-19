package pattern.structural.decorator.myexample.deco.recipe;

public interface RamenRecipe {
    void cook();
    <T extends Ingredient> void next(T next);
}
