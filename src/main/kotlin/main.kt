fun main(args: Array<String>) {


}

class array{
    val tamaño: Int = 10
    fun array1() {
        for (it in 0..10) {
            val tabla1 = Array<Int>(tamaño) { (it * 6) }

        }
        println("Tabla de multiplicar ${array1()}")
    }
}