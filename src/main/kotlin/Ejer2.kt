
import java.util.*
import java.util.concurrent.ThreadLocalRandom

open class Ejer2 (size: Int, relleno: (Int) -> Int){
    /*
    //var tamaño: Int = readLine()!!.toInt()
    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }
    val random = Random()

    val aleatorios = Array<Int>(10, {random.nextInt(50..250)}  )


     */



        var aleatorios = IntArray(size,relleno)


}