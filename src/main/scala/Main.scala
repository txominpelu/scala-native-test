import scala.scalanative._
import scala.scalanative.native._

object Main {
  def main(args: Array[String]): Unit = {
    MyStupidLib.printf(c"Hello %s!\n", c"world")
    MyStupidLib.printf(c"%d + %d = %d!\n", 3, 2, 3 + 2)
  }
}
