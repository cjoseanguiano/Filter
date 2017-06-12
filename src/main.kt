/**
 * Created by carlosjoseanguiano on 12/06/17.
 */

fun main(args: Array<String>) {

    val fruits = listOf("Avion", "arbol", "Elefante", "Uba", "Elote")
    fruits.filter { it.startsWith("A") }
            .sortedBy { it }
            .map {
                it.toUpperCase()
                        .forEach { print(it) }
            }
}