import kotlin.reflect.typeOf

// Требуется написать программу,
// которая при помощи условного оператора if…else определяет к какому типу относится переменная a,
// результат вывести в консоль в формате «Variable a is type_name».
// Программа должна уметь определять каждый из обговоренных на лекции типов.
// Домашнее задание by Seikin Alexey

fun main(){
    var a: Any = "Строка"
    if (a is String) {
        println(a + " - Variable a is String")
    }
    a = 'Q'
    if (a is Char){
        println(a + " - Variable a is Char")
    }
    a = 1
    if (a is Int) {
        println("1 - Variable a is Int")
    }
    a = 1.5
    if (a is Double) {
        println("1.5 - Variable a is Double")
    }
    a = 10.5F
    if (a is Float) {
        println("10.5F - Variable a is Float")
    }
    a = 105L
    if (a is Long) {
        println("105L - Variable a is Long")
    }
        a = true
    if (a is Boolean) {
        println("true - Variable a is Boolean")
    }
//  Не смог сделать определение типа переменной Бит с именем той же переменной a,
//  что была выше. Ничего умнее, чем ввести новую переменную и - не смог придумать.
    val b: Byte = 127
    a = b
    if (a is Byte) {
        println("127 - Variable b is Byte")
    }
}




