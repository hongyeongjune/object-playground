package objects.chapter1

class Audience(
    private val bag: Bag,
) {
    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}