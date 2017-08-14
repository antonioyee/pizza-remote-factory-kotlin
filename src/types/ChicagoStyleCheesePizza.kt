package types

import factory.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

class ChicagoStyleCheesePizza : Pizza() {

	init {
		name = "Chicago Style Deep Dish Cheese factory.Pizza"
		dough = "Extra Thick Crust Dough"
		sauce = "Plum Tomato Sauce"

		//toppings.add("Shredded Mozzarella Cheese")
	}

	override fun cut() {
		println("Cutting the pizza into square slice")
	}

}