//Task
//Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it.
//For every guess, the computer says whether the guess is correct, or too low, or too high. When the user finds
//the number, the computer will tell how many guesses were needed.

int numberToGuess = Math.abs(1000 * Math.random()), number, count = 1
println "Try to guess my number!"
for (number = 0; number != numberToGuess; count++) {
    print "Tell me my number: "
    number = Integer.parseInt(System.console().readLine())
    if (number == numberToGuess) {
        println "CORRECT!"
        println "Your needed " + count + " guesses."
    } else if (number < numberToGuess) {
        println "No! my number is higher"
    } else {
        println "No! my number is lower"
    }
}

