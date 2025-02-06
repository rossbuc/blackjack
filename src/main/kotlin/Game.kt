class Game {
    val deck: MutableList<Card> = mutableListOf()
    val winner: Player? = null

    fun dealCard(): Card {
        return Card("Ace of Hearts", 11, Suit.HEARTS)
    }
    fun compareHands() {
//        compare hands logic here
        println("The winner is...")
    }
}