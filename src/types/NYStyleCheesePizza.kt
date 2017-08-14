package types

import factory.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

class NYStyleCheesePizza() : Pizza() {

	init {
		name = "NY Style Sauce and Cheese factory.Pizza"
		dough = "Thin Crust Dough"
		sauce = "Martinara Sauce"

		//toppings.add("Greated Reggiano Chesse")
	}

}