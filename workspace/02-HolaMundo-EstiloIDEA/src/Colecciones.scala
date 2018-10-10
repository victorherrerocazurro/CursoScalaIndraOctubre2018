object Colecciones extends  App{
  (1 to 1000000000).view.filter(_ % 2 == 0).take(10).toList
}
