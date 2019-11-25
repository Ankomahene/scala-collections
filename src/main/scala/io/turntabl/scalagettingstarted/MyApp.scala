package io.turntabl.scalagettingstarted

object MyApp extends App {
    println("Hello, World!")

//    Ques 2
    val name: String = "Shadrack"
    val town: String = "Nyankomasi"

    println(s"$name was born in $town")

//    Que 3
    def threeTimes(s: String) = s * 3
    println(threeTimes("scala"))

//    Que 4
    def even(i: Int) = if(i % 2 == 0) true else false

//    Que 5
    def odd(i:Int) = if(!even(i)) true else false

//    Que 6
    def wordsToLower(words: String*) = words.map(_.toLowerCase)

//    Que 7
    def even2(n: Int) = even(n)

//    Que 8
    def isWeekendDay(day : String) = day match {
        case "saturday" | "sunday" => true
        case _ => false
    }

//    Que 9
    def areWeekendDays(days: String*) = days.map( isWeekendDay(_))

//    Que 10
    areWeekendDays("monday", "saturday", "sunday", "friday") foreach(println)

//    Que 11
    def tryMe(word: String, num: Int) = word * num
    println(tryMe("\nscala", 5))


}
