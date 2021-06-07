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

    Ejer2(10).arrayRan.forEach{
        println("Numero= ${it}")
    }


}