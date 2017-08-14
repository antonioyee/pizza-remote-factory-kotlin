import factory.Pizza
import store.ChicagoPizzaStore
import store.NYPizzaStore
import factory.PizzaStore

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

fun main(args: Array<String>) {
	val nyStore: PizzaStore = NYPizzaStore()
	val chicagoStore: PizzaStore = ChicagoPizzaStore()

	var pizza: Pizza = nyStore.orderPizza("cheese")
	println("Ethan ordered a ${pizza.name}")
	println("---")

	pizza = chicagoStore.orderPizza("cheese")
	println("Hoel ordered a ${pizza.name}")
	println("---")

}