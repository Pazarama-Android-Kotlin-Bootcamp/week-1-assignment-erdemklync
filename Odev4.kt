private fun main(){
    runTestCases()
}

fun firstFactorial(num: Int): Int {
    /*
        Dönüş değeri 0'a ulaşana kadar bu fonksiyon recursive olarak çağrılır.
     */
    if (num == 0) return 1
    return num * firstFactorial(num - 1)
}

private fun runTestCases(){
    checkCase(mustReturn = "1", returnValue = firstFactorial(0).toString())
    checkCase(mustReturn = "1", returnValue = firstFactorial(1).toString())
    checkCase(mustReturn = "2", returnValue = firstFactorial(2).toString())
    checkCase(mustReturn = "6", returnValue = firstFactorial(3).toString())
    checkCase(mustReturn = "24", returnValue = firstFactorial(4).toString())
    checkCase(mustReturn = "120", returnValue = firstFactorial(5).toString())
}