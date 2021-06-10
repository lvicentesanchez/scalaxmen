package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExampleSpec extends AnyFlatSpec with Matchers {

  "The Example.greet method" should "say Ahoy if you are a pirate" in {
    Example.greet(true) shouldEqual "Ahoy"
  }

  "The Example.greet method" should "say Hello if you are not a pirate" in {
    Example.greet(false) shouldEqual "Hello"
  }

  "The Example.winner method" should "declare fst as winner if fst > snd" in {
    Example.winner(3, 2) shouldEqual Fst
  }

  "The Example.winner method" should "declare snd as winner if fst < snd" in {
    Example.winner(2, 3) shouldEqual Snd
  }

  "The Example.winner method" should "declare a tie if fst == snd" in {
    Example.winner(3, 3) shouldEqual Tie
  }

}
