```scala
class MyClass(val name: String) {
  private var _age: Int = 0 // Private mutable variable

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge
    else throw new IllegalArgumentException("Age cannot be negative")
  }
}

object Main extends App {
  val person = new MyClass("John")
  println(person.age) //Prints 0
  person.age = 30
  println(person.age) //Prints 30
  person.age = -10 // Throws IllegalArgumentException
}
```