//Taskk
//Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,
//RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
//Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
//Hint: remember that you can use .substring() to get the elements of a String.

int playerOneScore, playerTwoScore, difference
boolean finished = false
println "Rock, Paper, Scissors!"
while (!finished) {
    print "Input your selection: "
    String str = System.console().readLine()
    
    // Check input
    switch (str) {
    case "PP":
        println "Paper vs Paper..."
        println "TIE!!!"
        break;
    case "PR":
        println "Paper vs Rock..."
        println "Player One Wins!"
        playerOneScore++
        break;
    case "PS":
        println "Paper vs Scissors..."
        println "Player Two Wins!"
        playerTwoScore++
        break;
    case "RP":
        println "Rock vs Paper..."
        println "Player Two Wins!"
        playerTwoScore++
        break;
    case "RR":
        println "Rock vs Rock..."
        println "TIE!!!"
        break;
    case "RS":
        println "Rock vs Scissors..."
        println "Player One Wins!"
        playerOneScore++
        break;
    case "SP":
        println "Scissors vs Paper..."
        println "Player One Wins!"
        playerOneScore++
        break;
    case "SR":
        println "Scissors vs Rock..."
        println "Player Two Wins!"
        playerTwoScore++
        break;
    case "SS":
        println "Scissors vs Scissors..."
        println "TIE!!!"
        break;
    }
    
    //Check if player one is 3 points ahead of player two
    if (playerOneScore > playerTwoScore) {
        difference = playerOneScore - playerTwoScore
        if (difference == 3) {
            println ""
            println "Scores"
            println "Player One: " + playerOneScore
            println "Player Two: " + playerTwoScore
            println "Player One Is The Winner !"
            finished = true
        }
        
    //Check if player two is 3 points ahead of player one
    } else if (playerTwoScore > playerOneScore) {
        difference = playerTwoScore - playerOneScore
        if (difference == 3) {
            println ""
            println "Scores"
            println "Player One: " + playerOneScore
            println "Player Two: " + playerTwoScore
            println "Player Two Is The Winner !"
            finished = true
        }
    }
}    
