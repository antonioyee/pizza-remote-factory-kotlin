package factory

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

abstract class PizzaStore {

	fun orderPizza(type: String) : Pizza {
		val pizza: Pizza = createPizza(type)

		pizza.prepare()
		pizza.bake()
		pizza.cut()
		pizza.box()

		return pizza
	}

	abstract fun createPizza(type: String): Pizza

}