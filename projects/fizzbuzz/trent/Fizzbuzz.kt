fun fizzbuzz(max: Int) {
    for (i in 1 until max + 1) {
        var output: String = ""

        if (i % 3 == 0) output += "Fizz"
        if (i % 5 == 0) output += "Buzz"
        if (i % 7 == 0) output += "Bazz"

        if (output.length > 0) {
            println(output)
        } else {
            println(i)
        }
    }
}

fun main(args: Array<String>) {
        try {
            var input = args[0].toInt()
            if (input < 1) throw Exception("ERROR: Invalid input")
            println("Starting Fizzbuzz on $input")
            fizzbuzz(input)
        }
        catch(e: Exception) {
            println("Please provide a positive non-zero integer as an argument")
        }
}