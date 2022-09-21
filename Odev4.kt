private fun main(){
    print("Input: ")
    val inputValue = readLine()!!.toInt()
    print(firstFactorial(inputValue))
}

fun firstFactorial(num: Int): Int {
    /*
        Use the function as a recursive function until the return value reaches 0.
     */
    if (num == 0) return 1
    return num * firstFactorial(num - 1)
}