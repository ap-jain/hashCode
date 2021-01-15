import java.util.ArrayList;
import java.util.Scanner;

public class pizzaProblem {
//	5 1 2 1
//	3 onion pepper olive
//	3 mushroom tomato basil
//	3 chicken mushroom pepper
//	3 tomato mushroom basil
//	2 chicken basil
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_Of_Pizzas = sc.nextInt();
		int no_Of_Teams_Of_Twos = sc.nextInt();
		int no_Of_Teams_Of_Threes = sc.nextInt();
		int no_Of_Teams_Of_Fours = sc.nextInt();
		ArrayList<PizzaInfo> list = new ArrayList<>();
		// O(no_Of_Pizzas*max(no_Of_Ingredients))
		for (int i = 0; i < no_Of_Pizzas; i++) {
			int no_Of_Ingredients = sc.nextInt();
			ArrayList<String> ingredients = new ArrayList<>();
			for (int j = 0; j < no_Of_Ingredients; j++) {
				ingredients.add(sc.next());
			}
			PizzaInfo pizza = new PizzaInfo(no_Of_Ingredients, ingredients);
			list.add(pizza);
		}

	}

}
