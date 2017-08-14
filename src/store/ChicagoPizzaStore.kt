package store

import factory.*
import types.ChicagoStyleCheesePizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

class ChicagoPizzaStore: PizzaStore() {

	override fun createPizza(type: String): Pizza {
		var pizza: Pizza? = null

		when ( type ) {
			"cheese" -> pizza = ChicagoStyleCheesePizza()
		}

		return pizza!!
	}

}