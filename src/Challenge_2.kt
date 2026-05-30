fun main () {
    val allTickets = listOf(14, 23, 56, 71, 88, 9, 102, 33)
    val vipTickets = mutableListOf < Int > ()
    val normalTickets = mutableListOf < Int > ()
    for ( ticket in allTickets ) {
        if ( ticket % 2 == 0 ) {
            vipTickets.add ( ticket )
        }
        else normalTickets.add ( ticket )
    }
    println ( " The list of VIP tickets are : " )
    for ( tickets in vipTickets ) {
        print ( " $tickets " )
    }
    println ( " " )
    println ( " The list of normal tickets are : " )
    for ( tickets in normalTickets ) {
        print ( " $tickets " )
    }
}