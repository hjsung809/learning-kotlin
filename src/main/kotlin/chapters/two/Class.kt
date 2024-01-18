package chapters.two

class Animal(private var name: String) {
    override fun toString(): String {
        return "Animal name: $name"
    }

    fun getName() = name
    fun setName(name : String) {
        this.name = name
    }
}

class Dog(val name: String)

fun main() {
    val animal = Animal("animal1")
    val animal2 = Animal("animal1")
    val dog = Dog("dog1")

    println(animal)
    println(animal.getName())
    animal.setName("animal2")
    println(animal.getName())
//    println(animal.name)
    println(dog)
}