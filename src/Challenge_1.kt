 fun main() {
        val vendingMachine =
            mutableListOf("Cola", "EMPTY", "Chips", "EMPTY", "Candy", "Water", "EMPTY")
        var count = 0
        for (index in vendingMachine.indices) {
            if (vendingMachine[index] == "EMPTY") {
                vendingMachine[index] = "Restocked Item"
                count++
            }
        }
        println("The updated Inventory is: ")
        for (item in vendingMachine) {
                println(item)
        }
        println("There were $count empty slots ")
 }

