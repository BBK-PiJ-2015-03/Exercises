//TASK
//Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your
//program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
//0.10, 0.05, 0.02, 0.01) needed.

int nFifty, nTwenty, nTen, nFive, pTwo, pOne, fifty, twenty, ten, five, two, one
print "How much is your total? £"
Double totalAmount = Double.parseDouble(System.console().readLine())
print "How much have you paid: £"
Double givenAmount = Double.parseDouble(System.console().readLine())
//Rounds change amount to 2 decimal spaces
Double changeAmount = givenAmount - totalAmount

//Calculates amount of change owed
while (changeAmount > 50) {
    nFifty++
    changeAmount = changeAmount - 50
}
while (changeAmount > 20) {
    nTwenty++
    changeAmount = changeAmount - 20
}
while (changeAmount > 10) {
    nTen++
    changeAmount = changeAmount - 10
}
while (changeAmount > 5) {
    nFive++
    changeAmount = changeAmount - 5
}
while (changeAmount > 2) {
    pTwo++
    changeAmount = changeAmount - 2
}
while (changeAmount > 1) {
    pOne++
    changeAmount = changeAmount - 1
}
while (changeAmount > 0.50) {
    fifty++
    changeAmount = changeAmount - 0.50
}
while (changeAmount > 0.20) {
    twenty++
    changeAmount = changeAmount - 0.20
}
while (changeAmount > 0.10) {
    ten++
    changeAmount = changeAmount - 0.10
}
while (changeAmount > 0.05) {
    five++
    changeAmount = changeAmount - 0.05
}
while (changeAmount > 0.02) {
    two++
    changeAmount = changeAmount - 0.02
}
while (changeAmount > 0.01) {
    one++
    changeAmount = changeAmount - 0.01
}
println " "
println "Your Change is:"
println "***************"
//Prints amount of change owed
if (nFifty > 0) {
    println nFifty + " x £50 Note(s)"
}
if (nTwenty > 0) {
    println nTwenty + " x £20 Note(s)"
}
if (nTen > 0) {
    println nTen + " x £10 Note(s)"
}
if (nFive > 0) {
    println nFive + " x £5 Note(s)"
}
if (pTwo > 0) {
    println pTwo + " x £2 Coin(s)"
}
if (pOne > 0) {
    println pOne + " x £1 Coin(s)"
}
if (fifty > 0) {
    println fifty + " x 50p Coin(s)"
}
if (twenty > 0) {
    println twenty + " x 20p Coin(s)"
}
if (ten > 0) {
    println ten + " x 10p Coin(s)"
}
if (five > 0) {
    println five + " x 5p Coin(s)"
}
if (two > 0) {
    println two + " x 2p Coin(s)"
}
if (one > 0) {
    println one + " x 1p Coin(s)"
}