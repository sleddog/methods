fun fizzbuzz(max: Int) {
    for (i in 1 until max + 1) {
        var a = i % 3 == 0
        var b = i % 5 == 0

        if (a && b) println("FizzBuzz")
        else if (a) println("Fizz")
        else if (b) println("Buzz")
        else println(i)
    }
}

fun main(args: Array<String>) {
    if (args.size > 0) {
        var input = args[0].toInt()
        println("Starting Fizzbuzz on $input")
        fizzbuzz(input)
    } else {
        println("Please provide an integer as an argument")
    }
}