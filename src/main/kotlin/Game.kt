class Game {
    val deck: MutableList<Card> = mutableListOf(
        Card("Ace", 11, Suit.HEARTS),
        Card("King", 10, Suit.HEARTS),
        Card("Queen", 10, Suit.HEARTS),
        Card("Jack", 10, Suit.HEARTS),
        Card("10", 10, Suit.HEARTS),
        Card("9", 9, Suit.HEARTS),
        Card("8", 8, Suit.HEARTS),
        Card("7", 7, Suit.HEARTS),
        Card("6", 6, Suit.HEARTS),
        Card("5", 5, Suit.HEARTS),
        Card("4", 4, Suit.HEARTS),
        Card("3", 3, Suit.HEARTS),
        Card("2", 2, Suit.HEARTS),
        Card("Ace", 11, Suit.DIAMONDS),
        Card("King", 10, Suit.DIAMONDS),
        Card("Queen", 10, Suit.DIAMONDS),
        Card("Jack", 10, Suit.DIAMONDS),
        Card("10", 10, Suit.DIAMONDS),
        Card("9", 9, Suit.DIAMONDS),
        Card("8", 8, Suit.DIAMONDS),
        Card("7", 7, Suit.DIAMONDS),
        Card("6", 6, Suit.DIAMONDS),
        Card("5", 5, Suit.DIAMONDS),
        Card("4", 4, Suit.DIAMONDS),
        Card("3", 3, Suit.DIAMONDS),
        Card("2", 2, Suit.DIAMONDS),
        Card("Ace", 11, Suit.CLUBS),
        Card("King", 10, Suit.CLUBS),
        Card("Queen", 10, Suit.CLUBS),
        Card("Jack", 10, Suit.CLUBS),
        Card("10", 10, Suit.CLUBS),
        Card("9", 9, Suit.CLUBS),
        Card("8", 8, Suit.CLUBS),
        Card("7", 7, Suit.CLUBS),
        Card("6", 6, Suit.CLUBS),
        Card("5", 5, Suit.CLUBS),
        Card("4", 4, Suit.CLUBS),
        Card("3", 3, Suit.CLUBS),
        Card("2", 2, Suit.CLUBS),
        Card("Ace", 11, Suit.SPADES),
        Card("King", 10, Suit.SPADES),
        Card("Queen", 10, Suit.SPADES),
        Card("Jack", 10, Suit.SPADES),
        Card("10", 10, Suit.SPADES),
        Card("9", 9, Suit.SPADES),
        Card("8", 8, Suit.SPADES),
        Card("7", 7, Suit.SPADES),
        Card("6", 6, Suit.SPADES),
        Card("5", 5, Suit.SPADES),
        Card("4", 4, Suit.SPADES),
        Card("3", 3, Suit.SPADES),
        Card("2", 2, Suit.SPADES),
    )
    var winner: Player? = null


    fun compareHands(player: Player, dealer: Dealer): Player? {
//        compare hands logic here
        val playerScore = player.hand.sumOf { card: Card -> card.value }
        val dealerScore = dealer.hand.sumOf { card: Card -> card.value }

        when {
            playerScore > dealerScore -> this.winner = player
            playerScore < dealerScore -> this.winner = dealer
            else -> println("It's a draw")
        }

        return winner
    }
}