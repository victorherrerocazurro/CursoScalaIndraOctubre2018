object ImplementacionDrop extends App{

  val l = List(1,2,3,4)

  println(l)
  println(drop(l, 2))

  def drop(lista : List[Any], n : Int): List[Any]= lista match {
    case Nil => Nil
    case lista if n == 0 => lista
    case _ => drop(lista.tail, n-1)
  }

}
