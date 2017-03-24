import scala.scalajs.js
import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExportTopLevel


object core extends js.JSApp{
  @scala.scalajs.js.annotation.JSExport
  def main(): Unit = {

  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}