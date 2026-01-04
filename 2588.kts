import java.util.*

fun main(args : Array<String>) : Unit = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    println(a * (b % 100 % 10));
    println(a * (b / 10 % 10));
    println(a * (b / 100));
    println(a * b);
}
