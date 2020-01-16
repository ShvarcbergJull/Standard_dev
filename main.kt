import java.io.BufferedReader
import java.io.File
import kotlin.math.*

fun file_read(fileName: String) : String
{
    val bufferedReader: BufferedReader = File(fileName).bufferedReader()
    val inputString = bufferedReader.use{ it.readText() }
    return inputString
}

fun main(args: Array<String>) {
    val fileName = readLine()!!
    val text = file_read(fileName)
    var sum = 0.0
    var count = 0
    var ft = text.split("\n")
    val numbers = ft.map { it.toDoubleOrNull() }
    for (num in numbers) {
        if (num != null) {
            sum += num
            count++
        }
    }
    val m = sum / count
    sum = 0.0
    for (num in numbers) {
        if (num != null) {
            sum += ((num - m) * (num - m))
        }
    }
    val q = sum / count
    println(sqrt(q))
}
