import scala.scalanative._
import scala.scalanative.native._

@extern
object MyStupidLib {
  def printf(format: CString, args: CVararg*): CInt = extern
}

