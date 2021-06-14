package examples.withconfig

fun main() {
    println("something")
    val obj = SomePojo()
    obj.name = "test"
    val s: String = obj.name
    obj.age = 12
    val v = obj.human
    obj.human = !v
    println(obj)

    val ddd = SomeData()

    JavaUsage.cycleUsage()
}

class SomeKotlinClass {
    fun call() {
        val ddd = SomeData()
        ddd.age = 12
        println(ddd)
    }
}
