package com {
  package curso {

  }
}

class Persona(var nombre: String, var edad: Int) {
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

  override def equals(that: Any): Boolean = that match {
    case that: Persona => that.isInstanceOf[Persona] &&
          this.nombre == that.asInstanceOf[Persona].nombre &&
          this.edad == that.asInstanceOf[Persona].edad
    case _ => false
  }
  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = prime * result + edad;
    result = prime * result + (if (nombre == null) 0 else nombre.hashCode)
    return result
  }
}

class Cliente(private var _nombre: String, private var _edad: Int) {

  println("Construyendo la Persona: Los Set y Get (Se eejcuta en el constructor principal)")

  def nombre = _nombre // accessor

  def nombre_=(nombre: String) { _nombre = nombre } // mutator
}
