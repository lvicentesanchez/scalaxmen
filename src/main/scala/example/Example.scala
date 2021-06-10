package example

sealed trait Winner
case object Fst extends Winner
case object Snd extends Winner
case object Tie extends Winner

object Example {
  
  def greet(imAPirate: Boolean): String =
    if (imAPirate) "Ahoy" else "Hello"

  def winner(a: Int, b: Int): Winner =
    if (a > b) Fst
    else if (a == b) Tie
    else Snd

}
