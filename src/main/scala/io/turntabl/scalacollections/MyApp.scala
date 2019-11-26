package io.turntabl.scalacollections

object MyApp extends App {
    val favorite = ("shadrack", "Scala")
    var name, language = favorite

    val countriesCapitals = Map(
        "Ghana" -> "Accra",
        "Germany" -> "Berlin",
        "France" -> "Paris"
    )

    val c = countriesCapitals.+("India" -> "Delhi", "UK" -> "London")
    println(c)

    val norway = c.getOrElse("Norway", "Unknown")
    println(norway)

    val friendsFirstNames = Set("Maxwell", "Justina", "Benjamin", "John", "Cleopatra", "Eva", "Jeniffer")
    val newFriends= friendsFirstNames.+("Samuel", "Samuel")
    println(newFriends.count(_ == "Samuel"))

    val names = List("Isaac", "Yaa", "Franklin", "Denis")
    names foreach(println)

    val namesGT6Letters = names foreach(n => if(n.length>6) n)
    println(namesGT6Letters)

    println(names.count(_.length > 6))



}
