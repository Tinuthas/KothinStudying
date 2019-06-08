package com.mykotlin
// Classes e metodos comecam com public final por padrão, ver se alterar isso usando "open"
fun main() {
    var dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()

    println(cat.fly)
}

open class Animal {
    var color: String = ""
    open var fly:Boolean = false

    open fun eat(){
        println("Animal eating")
    }

}
class Dog: Animal(){
    public var bread: String = ""


    fun bark(){
        println("Bark")
    }

    override fun eat() {
        super<Animal>.eat()
        println("Dog eating")
    }
}

class Cat: Animal() {
    var age: Int = -1
    override var fly = true

    fun meow() {
        println("Meow")
    }

    override fun eat(){
        println("Cat eating")
    }
}