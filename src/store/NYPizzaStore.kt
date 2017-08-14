package store

import factory.*
import types.NYStyleCheesePizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

class NYPizzaStore : PizzaStore() {

	override fun createPizza(type: String): Pizza {
		var pizza: Pizza? = null

		when ( type ) {
			"cheese" -> pizza = NYStyleCheesePizza()
		}

		return pizza!!
	}

}