open class Ejer3 {
    /*
    fun miembro(Array:Int) {

        Ejer2().aleatorios.filter {
            Ejer2().aleatorios.size % 2 != 0
        }.forEach {
            println(it)
        }
    }

     */
    fun miembro(nAleatorios: IntArray){

        nAleatorios.filter {
            it % 2 != 0
        }.forEach {
            println("Impar" + it)
        }

    }
}