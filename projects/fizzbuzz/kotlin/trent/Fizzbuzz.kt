fun fizzbuzz(max: Int) {
    for (i in 1 until max + 1) {
        println(checkFizz(i))
    }
}

fun checkFizz(input: Int): String {
    var output: String = ""

    if (input % 3 == 0) output += "Fizz"
    if (input % 5 == 0) output += "Buzz"
    if (input % 7 == 0) output += "Bazz"
    if (output.length == 0) output += input.toString()

    return output
}

fun testCheckFizz() {
    assert(checkFizz(1) == "1")
    assert(checkFizz(3) == "Fizz")
    assert(checkFizz(5) == "Buzz")
    assert(checkFizz(7) == "Bazz")
    assert(checkFizz(15) == "FizzBuzz")
    assert(checkFizz(21) == "FizzBazz")
    assert(checkFizz(35) == "BuzzBazz")
    assert(checkFizz(105) == "FizzBuzzBazz")
}

fun main(args: Array<String>) {
    testCheckFizz()
    try {
        var input = args[0].toInt()
        if (input < 1) throw Exception("ERROR: Invalid input")
        println("Starting Fizzbuzz on $input")
        fizzbuzz(input)
    } catch (e: Exception) {
        println("Please provide a positive non-zero integer as an argument")
    }
}