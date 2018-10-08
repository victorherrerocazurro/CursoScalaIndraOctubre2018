abstract class Component {}

//Propiedades son val
case class TextField(text : String) extends Component {}

//Objeto de compañia (Factorias), refactoriazacion de metodos estaticos
object TextField {
  def apply(): TextField = new TextField("")
}

case class Button(texto : String) extends TextField(texto) {}

case class Form(action: String) extends Component {}