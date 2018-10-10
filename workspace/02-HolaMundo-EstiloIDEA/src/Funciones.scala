class Funciones {

  val sumar2 = sumar(_: Int, 2)

  //Donde la definicion del método sería
  def sumar (a: Int, b: Int) : Int = {
    return a + b
  }

  //Y la invocación real del algoritmo
  sumar2(1)

  sumar2(3)

  sumar2(4)

  sumar2(10)

  sumar(10, 7)

}
