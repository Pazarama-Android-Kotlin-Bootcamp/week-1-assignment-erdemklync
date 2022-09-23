private fun main(){
    var input: String

    do {
        print("Bir sayı dizisi girin: ")
        input = readLine() ?: ""
    }while (input.isBlank())

    // Gelen input'u bölüp her öğesini integer'a dönüştür ve bunları bir IntArray'e dönüştür.
    val intArray = input.split(" ").map { it.toLong() }.toLongArray()

    print(aVeryBigSum(intArray))
}

fun aVeryBigSum(intArray: LongArray): Long {
    // fold metodu her öğenin üzerinden geçip öğeyi bir toplamda tutmamıza yarıyor.
    return intArray.fold(0){ sum, value -> sum + value }
}

