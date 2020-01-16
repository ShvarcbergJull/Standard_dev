import scala.io.Source
import scala.math

object main extends App{
  final val fileName = scala.io.StdIn.readLine()

  val lines  = Source.fromFile(fileName).getLines().toArray
  val numbers = lines.map(_.toDouble)
  var sum = 0.0

  for (el <- numbers) {
    sum = sum + el
  }
  val m = sum / numbers.size
  sum = 0.0
  for (num <- numbers) {
    sum = sum + (num - m) * (num - m)
  }
  val q = sum / numbers.size
  println(math.sqrt(q))
}
