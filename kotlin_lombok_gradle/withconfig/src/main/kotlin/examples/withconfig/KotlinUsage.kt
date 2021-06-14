package examples.withconfig

fun main() {
    val obj = SomePojo()
    obj.name = "test"
    val s: String = obj.name
    obj.age = 12
    val v = obj.getHuman()
    obj.setHuman(!v)
    println(obj)
}
