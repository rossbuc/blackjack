class Dealer(name: String) : Player(name) {

    override fun hit() = println("I'm the dealer called $name, and i'm hitting!")
    fun deal() = println("I'm dealing the hand")
}