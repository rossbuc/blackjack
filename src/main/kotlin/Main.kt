fun main(args: Array<String>) {
    val bob = Player("Bob")
    bob.hit()
    val jerry = Dealer("Jerry")
    jerry.hit()
    jerry.deal()
    val game1 = Game()
    game1.dealCard()
}