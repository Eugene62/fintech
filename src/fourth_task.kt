import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(mult(a,b))
}

fun mult(multiplicand:Int,multiplier:Int) = multiplicand * multiplier