object HolaMundo {

  //Metodo que permite iniciar la ejecucion de un algortimo
  def main(argumentosDeEntrada: Array[String]): Unit = {
    println("Hola Mundo!!")



    1 + 1

    var p = new Persona(edad = 12, nombre = "Victor")

    println(p.nombre)

    p.nombre = "Juan"

    println(p.nombre)

    new Persona

    var cliente = new Cliente("Victor", 35)

    println (cliente.nombre)

    cliente.nombre_=("Juan")

    println (cliente.nombre)

    cliente.nombre = "Pedro"

    println (cliente.nombre)

    //--------CASE CLASS

    var c = TextField("Etquieta")

    var f = TextField

    //if-else-if
  if(c.text == "Etquieta"){
    print(c.text)
  }


    c match {
      case TextField(text) if text == "Etquieta" => print(text)
      //case Button(text) => print(text)
      case _ => print("No es un textfield")
    }





  }
}

object Aplicacion extends App {

    print("Hola Mundo!!")

  print("Hola Mundo!!")

  print("Hola Mundo!!")

  print("Hola Mundo!!")

  print("Hola Mundo!!")

}
