package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    @Test
    void createTestByName(){
        Recipe recipe = new Recipe("Leves");
        assertEquals("Leves", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0,recipe.getIngredients().size());
    }
    @Test
    void createTestByNameAndDescription(){
        Recipe recipe = new Recipe("Leves", "Jófféle");
        assertEquals("Leves", recipe.getName());
        assertEquals("Jófféle",recipe.getDescription());

    }

    @Test
    void addOneIngredient(){
        Recipe recipe = new Recipe("Leves", "Jófféle");
        recipe.addIngredient("hagyma");
        assertEquals("hagyma",recipe.getIngredients());

    }

    @Test
    void addIngredient() {
        Recipe recipe = new Recipe("Leves", "Jófféle");
        recipe.addIngredient("hagyma","hús", "répa");
        assertEquals(3, recipe.getIngredients().size());
        assertArrayEquals(new String[]{"hagyma","hús","répa"},recipe.getIngredients().toArray());
    }
}