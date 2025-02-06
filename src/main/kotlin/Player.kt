open class Player(val name: String) {
    val hand: MutableList<Card> = mutableListOf()
    val score: Int = 0

    open fun hit() = println("I'm $name and i'm hitting!")
    fun stick() = println("I'm gonna stick :)")
}