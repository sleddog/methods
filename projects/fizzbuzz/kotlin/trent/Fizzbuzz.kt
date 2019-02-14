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
    assert("1" == checkFizz(1))
    assert("Fizz" == checkFizz(3))
    assert("Buzz" == checkFizz(5))
    assert("Bazz" == checkFizz(7))
    assert("FizzBuzz" == checkFizz(15))
    assert("FizzBazz" == checkFizz(21))
    assert("BuzzBazz" == checkFizz(35))
    assert("FizzBuzzBazz" == checkFizz(105))
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