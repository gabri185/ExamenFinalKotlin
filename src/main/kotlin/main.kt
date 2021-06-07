import kotlin.random.Random

fun main(args: Array<String>) {
    /*
    *Tabla del 7
     */
    Ejer1(11).tablita.forEach{
        println("7*${it/7} = ${it}")
    }

    /*
    *Array numeros aleatorios
     */

    val nAleaorios = Ejer2(10){
        Random.nextInt(50,250)
    }
    nAleaorios.aleatorios.forEach {
        println("Numero= $it")

    }


    /*
    *Numeros impares
     */

    Ejer3().miembro(nAleaorios.aleatorios)


}