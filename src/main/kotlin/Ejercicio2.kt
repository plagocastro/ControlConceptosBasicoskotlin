class Ejercicio2 (var tamaño:Int){
    fun TablaD6(){
        tamaño = 11
        val tablaMul = Array<Int>(tamaño) { it * 6 }.forEach {
            print("6*${it / 6} = ${it}")
        }
    }
}
