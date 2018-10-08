object Aplicacion extends App{

  var bmw = new Coche("BMW", _modelo = "316i")

  var audi = new Coche(null, _modelo = "A3")

  new Coche()

  new Coche(_marca = "Citroen")

  new Coche(_modelo = "C3")

  bmw.arrancar

  //Para poder emplear la sintaxis reducida del mutator, es necesario definir el accesor
  bmw.marca = ""

  bmw.parar

  audi.arrancar

  audi.parar
}
