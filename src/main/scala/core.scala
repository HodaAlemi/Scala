import scala.scalajs.js
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExportTopLevel


object core extends js.JSApp{
  @scala.scalajs.js.annotation.JSExport
  def main(): Unit = {
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the curl button!</p>")
  }
}