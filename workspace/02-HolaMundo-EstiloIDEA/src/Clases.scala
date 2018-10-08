class Persona(var nombre: String, edad: Int) {
  //Constructor con un parametro
  def this(edad: Int) {
    this("", edad)
  }
  def this(nombre: String) {
    this(nombre, 0)
  }
  def this() {
    this("")
  }
}

class Cliente(private var _nombre: String, private var _edad: Int) {

  println("Construyendo la Persona: Los Set y Get (Se eejcuta en el constructor principal)")

  def nombre = _nombre // accessor

  def nombre_=(nombre: String) { _nombre = nombre } // mutator
}
