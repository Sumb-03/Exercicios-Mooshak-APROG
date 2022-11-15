import java.util.Scanner;

public class EssentialO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int invalidIngredients, invalidIngredientscopy, numberOfPizzas, menuPizza, menuPizzacopy, suggestionCount = 1;
        int invalidalg1, menupizzaalg1;
        boolean wrongpizza;
        invalidIngredients = sc.nextInt();
        invalidIngredientscopy = invalidIngredients;
        numberOfPizzas = sc.nextInt();

        for (int i = 1; i <= numberOfPizzas; i++) {
            menuPizza = sc.nextInt();
            menuPizzacopy = menuPizza;
            wrongpizza = false;

            do {
                menupizzaalg1 = menuPizza % 10;
                menuPizza = menuPizza / 10;
                invalidIngredients = invalidIngredientscopy;
                do {
                    invalidalg1 = invalidIngredients % 10;
                    invalidIngredients = invalidIngredients / 10;

                    if (menupizzaalg1 == invalidalg1) {
                        wrongpizza = true;
                    }
                } while (invalidIngredients != 0);
            } while (menuPizza != 0);

            if (!wrongpizza) {
                System.out.println("Suggestion #" + suggestionCount + ":" + menuPizzacopy);
                suggestionCount++;
            }
        }
    }
}
