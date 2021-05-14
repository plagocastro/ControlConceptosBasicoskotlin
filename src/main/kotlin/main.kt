fun main(args: Array<String>) {
    val array = array(10)
    println("La tabla del 6 será")
    array.tablaMul.forEach{
        print("6*${it/6} = ${it}")

    }

}

class array(val tamaño:Int){
            val tablaMul = Array<Int>(tamaño){ it * 6 }

    }
