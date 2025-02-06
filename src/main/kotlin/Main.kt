fun main(args: Array<String>) {
    val bob = Player("Bob")
    bob.hit()
    val jerry = Dealer("Jerry")
    jerry.hit()
    jerry.deal()
}