private fun main(){
    runTestCases()
}

private fun questionsMarks(str: String): String{
    var returnValue = false

    var previousDigit = 0
    var questionMarks = 0

    for (char in str){
        // char bir harfse bu öğe için döngüye girme.
        if(char.isLetter()) continue

        // char bir rakamsa
        if (char.isDigit()){
            // char karakteri currentDigit isimli bir değişkene ata ve previousDigit ile topla.
            val currentDigit = char.digitToInt()
            val sum = previousDigit + currentDigit

            // Toplam 10 ise
            if(sum == 10) {

                // Toplam = 10 ve questionMarks = 3 ise dönüş değerini true'ya eşitle ve döngüye devam et.
                // Döngü devam etmeli çünkü sonraki değerler için false olabilir.
                if(questionMarks == 3){
                    returnValue = true
                }else{
                    // Toplam 10 olduğu halde questionMarks 3 değilse dönüş değerini false'a eşitle.
                    returnValue = false
                    // Tek bir false değeri döngünün bitip fonksiyonun false dönmesi için yeterli.
                    break
                }
            }

            previousDigit = currentDigit
            questionMarks = 0
        }

        // char karakteri soru işareti ise questionMarks değerini artır.
        if (char == '?') questionMarks++

    }

    return returnValue.toString()
}

private fun runTestCases(){
    checkCase(mustReturn = "true", returnValue = questionsMarks("arrb6???4xxbl5???eee5"))
    checkCase(mustReturn = "false", returnValue = questionsMarks("aa6?9"))
    checkCase(mustReturn = "true", returnValue = questionsMarks("acc?7??sss?3rr1??????5"))
    checkCase(mustReturn = "false", returnValue = questionsMarks("aaaaaaarrrrr??????"))
    checkCase(mustReturn = "true", returnValue = questionsMarks("9???1???9???1???9  "))
    checkCase(mustReturn = "false", returnValue = questionsMarks("9???1???9??1???9"))
    checkCase(mustReturn = "false", returnValue = questionsMarks("4?5?4?aaccc9"))
    checkCase(mustReturn = "false", returnValue = questionsMarks("5??aaaaabcgaaaaaaaaaa?5?5"))
    checkCase(mustReturn = "true", returnValue = questionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?a??5"))
    checkCase(mustReturn = "false", returnValue = questionsMarks("mbbv???????????4??????ddsdsdcc9?"))
}