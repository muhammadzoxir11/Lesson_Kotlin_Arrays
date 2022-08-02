//import java.util.*
//
//fun main() {
//
//    val scanner = Scanner(System.`in`)
//
//
//    val name = arrayOf<String>("Ali", "Bill", "Alex", "Bone", "Alisa", "Bony")
//
//    nameA(name)
//    println("+++++++++++++")
//    nameB(name)
//
//
//    val nameA = arrayOfNulls<String>(100)
//    val nameB = arrayOfNulls<String>(100)
//
//    var count = 0
//
//    for (names in name.indices) {
//
//        if (name[names].startsWith("A")) {
//            nameA[count] = name[names]
//            count++
//
//        }
//    }
//    for (names in 0 until count) {
//        println(nameA[names])
//    }
//
//    count = 0
//    println()
//
//    for (names in name.indices) {
//
//        if (name[names].startsWith("B")) {
//            nameB[count] = name[names]
//            count++
//
//        }
//    }
//    for (names in 0 until count) {
//        println(nameB[names])
//    }
//
//}
//
//fun nameB(array: Array<String>) {
//    val nameB = arrayOfNulls<String>(100)
//    var count = 0
//    for (i in array.indices) {
//        if (array[i].startsWith("B")) {
//            nameB[count] = array[i]
//            count++
//        }
//    }
//
//
//
//    for (n in 0 until count) {
//        println(nameB[n])
//    }
//
//}
//
//fun nameA(array: Array<String>) {
//    val nameA = arrayOfNulls<String>(100)
//    var count = 0
//    for (i in array.indices) {
//        if (array[i].startsWith("A")) {
//            nameA[count] = array[i]
//            count++
//        }
//    }
//
//
//
//    for (n in 0 until count) {
//        println(nameA[n])
//    }
//
//}