import java.util.*

fun main() {
    // readLine()으로 한 줄을 읽고 공백으로 분리한 후, 각 문자열을 Int로 변환
    // !!는 null이 아니라고 가정 (코틀린 1.3 이후 버전에서는 readLine()이 String?을 반환)
    // 더 안전하게 하려면 readLine()?.split(' ')?.map { it.toInt() } 사용 후 null 체크 필요
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    // 두 정수의 합을 출력
    println(a + b)
}
