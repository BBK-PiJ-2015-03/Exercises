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

println " "
println "Your Change is:"
println "***************"

//Calculates amount of change owed
while (changeAmount >= 50) {
    nFifty++
    changeAmount = changeAmount - 50
}
if (nFifty > 0) {
    println nFifty + " x £50 Note(s)"
}
while (changeAmount >= 20) {
    nTwenty++
    changeAmount = changeAmount - 20
}
if (nTwenty > 0) {
    println nTwenty + " x £20 Note(s)"
}
while (changeAmount >= 10) {
    nTen++
    changeAmount = changeAmount - 10
}
if (nTen > 0) {
    println nTen + " x £10 Note(s)"
}
while (changeAmount >= 5) {
    nFive++
    changeAmount = changeAmount - 5
}
if (nFive > 0) {
    println nFive + " x £5 Note(s)"
}
while (changeAmount >= 2) {
    pTwo++
    changeAmount = changeAmount - 2
}
if (pTwo > 0) {
    println pTwo + " x £2 Coin(s)"
}
while (changeAmount >= 1) {
    pOne++
    changeAmount = changeAmount - 1
}
if (pOne > 0) {
    println pOne + " x £1 Coin(s)"
}
while (changeAmount >= 0.50) {
    fifty++
    changeAmount = changeAmount - 0.50
}
if (fifty > 0) {
    println fifty + " x 50p Coin(s)"
}
while (changeAmount >= 0.20) {
    twenty++
    changeAmount = changeAmount - 0.20
}
if (twenty > 0) {
    println twenty + " x 20p Coin(s)"
}
while (changeAmount >= 0.10) {
    ten++
    changeAmount = changeAmount - 0.10
}
if (ten > 0) {
    println ten + " x 10p Coin(s)"
}
while (changeAmount >= 0.05) {
    five++
    changeAmount = changeAmount - 0.05
}
if (five > 0) {
    println five + " x 5p Coin(s)"
}
while (changeAmount >= 0.02) {
    two++
    changeAmount = changeAmount - 0.02
}
if (two > 0) {
    println two + " x 2p Coin(s)"
}
while (changeAmount >= 0.01) {
    one++
    changeAmount = changeAmount - 0.01
}
if (one > 0) {
    println one + " x 1p Coin(s)"
}