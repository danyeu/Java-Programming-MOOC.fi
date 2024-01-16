import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Scanner file;
    private ArrayList<Recipe> recipes;
    public UI() {
        scanner = new Scanner(System.in);
    }
    private void loadFile() throws Exception {
        System.out.print("File to read: ");
        String filePath = "";
        while (filePath.isEmpty()) {
            filePath = scanner.nextLine().trim();
        }

        try {
            file = new Scanner(Paths.get(filePath));
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void loadRecipes() {
        while (file.hasNextLine()) {
            String name = file.nextLine();
            int cookingTime = Integer.parseInt(file.nextLine());
            ArrayList<String> ingredients = new ArrayList<>();
            while (true) {
                String ingredient = file.nextLine();
                if (ingredient.isEmpty() | !file.hasNextLine()) {
                    break;
                }
                ingredients.add(ingredient);
            }
            Recipe r = new Recipe(name, cookingTime, ingredients);
            recipes.add(r);
        }
    }

    private void cmdList() {
        System.out.println();

        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            System.out.println(r);
        }
    }

    private void cmdFindName() {
        String recipeWanted;
        while (true) {
            System.out.print("Searched word: ");
            recipeWanted = scanner.nextLine();
            if (!recipeWanted.isEmpty()) {
                break;
            }
        }

        System.out.println();

        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            if (r.getName().contains(recipeWanted)) {
                System.out.println(r);
            }
        }
    }
    public void cmdFindCookingTime() {
        int maxTime;
        while (true) {
            System.out.print("Max cooking time: ");
            try {
                maxTime = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            if (r.getCookingTime() <= maxTime) {
                System.out.println(r);
            }
        }
    }
    public void cmdFindIngredient() {
        String ingredient;
        while (true) {
            System.out.print("Ingredient: ");
            ingredient = scanner.nextLine();
            if (!ingredient.isEmpty()) {
                break;
            }
        }
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe r : recipes) {
            boolean printRecipe = false;
            for (String i : r.getIngredients()) {
                if (i.equals(ingredient)) {
                    printRecipe = true;
                    break;
                }
            }
            if (printRecipe) {
                System.out.println(r);
            }
        }
    }
    public void start() {

        try {
            loadFile();
        } catch (Exception e) {
            System.out.println("Invalid file");
            return;
        }

        recipes = new ArrayList<>();
        loadRecipes();
        System.out.println();

        System.out.println(
                "Commands:\n" +
                        "list - lists the recipes\n" +
                        "stop - stops the program\n" +
                        "find name - searches recipes by name\n" +
                        "find cooking time - searches recipes by cooking time\n" +
                        "find ingredient - searches recipes by ingredient\n"
        );

        String command;
        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            if (command.equals("list")) {
                cmdList();
            } else if (command.equals("stop")) {
                return;
            } else if (command.equals("find name")) {
                cmdFindName();
            } else if (command.equals("find cooking time")) {
                cmdFindCookingTime();
            } else if (command.equals("find ingredient")) {
                cmdFindIngredient();
            }
            System.out.println();
        }





    }
}
