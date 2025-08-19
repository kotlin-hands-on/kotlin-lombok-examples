package examples.withkapt

fun main() {
    val obj = SomePojo()
//    val s: String = obj.name
    obj.name = "test"
    obj.age = 12
    println(obj)
}
