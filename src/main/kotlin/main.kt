fun main(args: Array<String>) {
    val array = Ejercicio1(10)
    println("La tabla del 6 será..")
    array.tablaMul.forEach{
        print("6*${it/6} = ${it}")

    }

}

