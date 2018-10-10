object  Ejercicio2 extends App {
  MiProcesadoDeBeca.procesarBeca(
    BecaDeEstudios("Victor",
                        new DatosFinancieros(20000, 2000)),
    //Este algoritmo NO es funcional, dado que no recibe por parametros la base de datos a emplear, luego siempre depende
    //de la misma base de datos y por tanto de su estado.
    () => {
      //Meter la logica que se conecte a una BD y obtenga los fondos disponibles en el momento en el que se ejecute
      0
    },
    //Funcion que recibiendo un formulario de beca, retorna si es valido o no, segun
    //-los campos no sean null
    //-cantidades sean mayor que 0
    (formularioDeBeca : BecaDeEstudios) => {
      formularioDeBeca match {
        case BecaDeEstudios(null, _) => false
        case BecaDeEstudios(_, null) => false
        case beca if
                beca.datosFinancieros.costeEstudios == null ||
                beca.datosFinancieros.ganancias == null ||
                beca.datosFinancieros.ganancias <= 0 ||
                beca.datosFinancieros.costeEstudios <= 0 => false
        case _ => true
      }
    }
  )
}

case class BecaDeEstudios (val titular : String, val datosFinancieros : DatosFinancieros){}

class DatosFinancieros(val ganancias: Double, val costeEstudios: Double){}

object MiProcesadoDeBeca {
  // Funcion que recibiendo una formulario de beca, retorna si se ha concedido o no.
  def procesarBeca(
                    formularioDeBeca : BecaDeEstudios,
                    obtenerFondosDisponibles: () => Double,
                    validador: (BecaDeEstudios) => Boolean) : Boolean = {
    //Validar
    if (validador(formularioDeBeca)){
      //Calcular
      val cuantia = calcular(formularioDeBeca.datosFinancieros)
      //Aprobar
      aprobar(cuantia, obtenerFondosDisponibles)
      //Notificar

      true
    } else {
      false
    }
  }



  //Funcion que recibiendo unos datos economicos calcula la cuantia de la beca que se puede conceder, segun
  //-Si las ganacias son menores o iguales que 10000 la cuantia es del 100% del coste de los estudios.
  //-Si las ganacias son mayores que 10000 y menores que 30000, la cuantia es de 50% del coste.
  //-Si las ganacias son mayores o iguales que 30000 la cuantia es del 0%.
  def calcular(datosFinancieros : DatosFinancieros): Double ={
    0
  }

  def aprobar(cuantia : Double, obtenerFondosDisponibles: () => Double) : Boolean = {
    obtenerFondosDisponibles() - cuantia >= 0
  }

  def aprobar(cuantia : Double, fondosDisponibles: Double) : Boolean = {
    fondosDisponibles - cuantia >= 0
  }
}

