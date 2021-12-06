package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recipe {
    private String name;
    private List<String> Ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void addIngredient(String s, String... more){
        Ingredients.add(s);
        Ingredients.addAll(Arrays.asList(more));
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return Ingredients;
    }

    public String getDescription() {
        return description;
    }
}
