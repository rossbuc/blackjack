fun main(args: Array<String>) {
    val bob = Player("Bob")
    bob.hit()
    val jerry = Dealer("Jerry")
    jerry.hit()
    jerry.deal(bob)
    println("This is bobs hand after the deal: ${bob.hand}")
    println("This is jerry the dealers hand after the deal: ${jerry.hand}")
    println("This is the size of the deck after the deal: ${jerry.deck.size}")
}