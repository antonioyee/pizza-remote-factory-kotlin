package factory

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 14/08/17.
 */

open abstract class Pizza {

	lateinit var name: String
	lateinit var dough: String
	lateinit var sauce: String
	//lateinit var toppings: ArrayList<String>

	open fun prepare() {
		val sb: StringBuilder = StringBuilder()

		sb.append("Preparing $name\n")
		sb.append("Tossing $dough\n ")
		sb.append("Adding $sauce\n")
		/*sb.append("Adding toppings:\n")

		for (field in toppings) {
			sb.append("$field\n")
		}*/

		println(sb.toString())
	}

	open fun bake() {
		println("Bake for 25 minutes at 350: $name")
	}

	open fun cut() {
		println("Cutting the pizza into diagonal slice: $name")
	}

	open fun box() {
		println("Place pizza in official factory.PizzaStore box: $name")
	}

}