```scala
case class MyClass(name: String, age: Int) {
  require(age >= 0, "Age cannot be negative")
}

object Main extends App {
  val person = MyClass("John", 30)
  println(person.age) //Prints 30
  // person.age = -10 // Compilation error: Cannot reassign val
  //The following creates a new instance, showcasing immutability
  val updatedPerson = person.copy(age = 35)
  println(updatedPerson.age) // Prints 35
}
```