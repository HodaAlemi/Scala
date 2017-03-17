import scala.scalajs.js
import org.scalajs.dom
import dom.document

object core extends js.JSApp{
  @scala.scalajs.js.annotation.JSExport
  def main(): Unit = {
    dom.window.alert("Hi from Scala-js-dom")
  }
}