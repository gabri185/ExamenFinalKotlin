
import java.util.*
import java.util.concurrent.ThreadLocalRandom

class Ejer2(size: Int) {
    //var tamaño: Int = readLine()!!.toInt()
    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }
    val random = Random()

    val arrayRan = Array<Int>( size, {random.nextInt(50..250)}  )

}