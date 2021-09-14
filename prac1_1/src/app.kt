fun main() {
    val number = readLine()
    if (number != null) {
        if (number.toIntOrNull() != null) {
            var mult = 1
            for (sym in number) {
                if ((sym.code - 48) % 3 == 0) mult *= sym.code - 48
            }
            println("result = $mult")
        }
        else println("must be integer")
    }
    else println("error")
}