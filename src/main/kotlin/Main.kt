fun main() {

    print("Digite uma string: ")
    val string = readLine()!!

    var invertida = ""

    for (i in string.length - 1 downTo 0) {

        invertida += string[i]
    }
    
    println("A string invertida é: $invertida")
}