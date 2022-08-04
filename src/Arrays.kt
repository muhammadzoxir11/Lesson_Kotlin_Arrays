import java.util.*
import kotlin.Array

fun main() {
    val scanner = Scanner(System.`in`)

    val userNameArrays = arrayOfNulls<String>(100)
    val cardNumberArrays = arrayOfNulls<String>(100)
    val phonePaymentHistory = arrayOfNulls<String>(100)
    val moneyPhoneHistory = arrayOfNulls<Int>(100)
    val cashbackArray = arrayOfNulls<Double>(100)



    println("Bone payment")


    var countArray = 0
    var countHistory = 0
    var cashback:Double = 0.0
    var cashbackCount = 0
    var res = 0

    while (true) {

        println()
        println("Cashback $res ")
        println("add card -> [1]")
        println("Phone payment -> [2]")
        println("Card payment->[3]")
        println("Card list->[4]")
        println("Payment history ->[5]")
        print("= ")
        val n = scanner.nextInt()

        when (n) {
            1 -> {
                print("User name write: ")
                val userName = scanner.next()
                print("Card number write: ")
                val cardNumber = scanner.next()
                if (userName.length >= 4) {
                    userNameArrays[countArray] = userName
                    cardNumberArrays[countArray] = cardNumber

                    countArray++
                    println("सक्सेस्फुल ! ! !")
                } else {

                    println("name number less !!!")
                }

            }
            2 -> {

                println("Phone payment")
                print("+998 ")
                val phoneNumber = scanner.next()
                print("money : ")
                val money = scanner.nextInt()

                if (phoneNumber.length == 9 && money >= 500) {
                    cashback = (money * 2 / 100 as Int).toDouble()

                    moneyPhoneHistory[countHistory] = money
                    phonePaymentHistory[countHistory] = phoneNumber
                    cashbackArray[cashbackCount] = cashback

                    cashbackCount++
                    countHistory++

                    println()
                    for (i in 0 .. cashbackCount) {


                    }
                    println("success!!!")
                } else {
                    println("phone number less or money less !!!")
                }

            }
            5->{
                for (i in 0 until  countHistory){

                    println(phonePaymentHistory[i])
                    println(moneyPhoneHistory[i])


                }
            }


        }


    }


}

fun cashCard(array: Array<Int>, count: Int, cash: Int) {
    var res = 0
    array[count] = cash
    for (i in 0..count) {
        res += cash
    }

}

