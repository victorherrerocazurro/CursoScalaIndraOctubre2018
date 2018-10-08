class Coche (private var _marca : String = "Renault", private var _modelo : String = "Megane") {

  //Con los parametros por defecto, conseguimos minimizar el codigo de contruccion a un solo constructor
  //logicamente si necesitamos distintas logicas de construccion no es camino


  def arrancar = {
    println("El " + modelo + " de " + marca + " arranco")
  }

  def parar= {
    println("El " + modelo + " de " + marca + " paro")
  }

  def marca = _marca

  def marca_= (marca : String) ={
    //Codigo que permita validar la asignacion
    if(marca != null && marca != "")
      _marca = marca
    else
      throw new Exception
  }

  def modelo_= (modelo : String) ={
    //Codigo que permita validar la asignacion
    _modelo = modelo
  }

  def modelo = _modelo

}
