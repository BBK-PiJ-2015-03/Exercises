// Task:
// Read five cards from the user. For each card, read the rank (1,2,3,4,5,6,7,8,9,
// 10,J,Q,K) and the suit (”spades”, ”hearts”, ”diamonds”, ”clubs”). Each of the
// five cards must be valid before accepting the next one. Once the program has
// the five cards, it should tell the user what is the best hand she has got, as per
// the following list (from best to worst):
// Straigh flush: all cards are of the same suite and their ranks are consecutive.
// Note that they are probably not ordered as they were entered.
// Poker: four of the five cards have the same rank.
// Full House: three of a kind plus two of a kind.
// Flush: all cards share the same suit, but are not consecutive.
// Straight: all cards are consecutive, but not of the same suit.
// Three of a kind: three of the five cards have the same rank.
// Two pairs: two pairs (see below).
// Pair: two of the five cards have the same rank.
// Nothing: any other situation.

int i1, i2, i3, i4, i5, s1, s2, s3, s4, s5
String c1, c2, c3, c4, c5, str, sp, hr, dm, cl
boolean cd1 = false, cd2 = false, cd3 = false, cd4 = false, cd5 = false, st1 = false, st2 = false, st3 = false, st4 = false, st5 = false
println "Please enter 5 cards (1 - 9, J, Q, K)"
while (!c1) {
    print "> "
    c1 = System.console().readLine()
    if (c1 == "1" || c1 == "2" || c1 == "3" || c1 == "4" ||c1 == "5" || c1 == "6" || c1 == "7" || c1 == "8" || c1 == "9" || c1 == "10") {
        i1 = Integer.parseInt(c1)
        card1 = true
    } else if (c1 == "J" || c1 == "j") {
        i1 = 11
        card1 = true
    } else if (c1 == "Q" || c1 == "q") {
        i1 = 12
        card1 = true
    } else if (c1 == "K" || c1 == "k") {
        i1 = 13
        card1 = true
    } else {
        println "Invalid Card Entered"
    }
}
while (!st1) {
    println "Please enter card suit"
    println "1 - Spades"
    println "2 - Hearts"
    println "3 - Diamonds"
    println "4 - Clubs"
    println " "
    print "> "
    s1 = Integer.parseInt(System.console().readLine())
    if (s1 > 4 && s1 < 0) {
        println "Sorry, that is not a valid option"
    } else {
        st1 = true
    }
}
println "Your card is the " + i1 " of " + s1
