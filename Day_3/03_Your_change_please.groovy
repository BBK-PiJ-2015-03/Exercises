//TASK
//Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your
//program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
//0.10, 0.05, 0.02, 0.01) needed.

// Get a random amount between 0 - 100
Double randomAmount = Math.abs(100 * Math.random())

// Round amount to 2 decimal spaces
// Credit: http://stackoverflow.com/questions/4560546/how-do-i-round-a-number-in-groovy
Double totalAmount = Math.round(randomAmount * 100) / 100

println "Your Total is: £" + totalAmount 
print "How much have you paid: £"
Double givenAmount = Double.parseDouble(System.console().readLine())

//Rounds change amount to 2 decimal spaces
Double changeAmount = Math.round((givenAmount - totalAmount) * 100) / 100

//Calculates amount of change owed
for (int nFifty = 0; changeAmount > 50; nFifty++) {
    changeAmount = changeAmount - 50
}
for (int nTwenty = 0; changeAmount > 20; nTwenty++) {
    changeAmount = changeAmount - 20
}
for (int nTen = 0; changeAmount > 10; nTen++) {
    changeAmount = changeAmount - 10
}
for (int nFive = 0; changeAmount > 5; nFive++) {
    changeAmount = changeAmount - 5
}
for (int pTwo = 0; changeAmount > 2; pTwo++) {
    changeAmount = changeAmount - 2
}
for (int pOne = 0; changeAmount > 1; pOne++) {
    changeAmount = changeAmount - 1
}

for (int fifty = 0; changeAmount > 0.50; fifty++) {
    changeAmount = changeAmount - 0.50
}
for (int twenty = 0; changeAmount > 0.20; twenty++) {
    changeAmount = changeAmount - 0.20
}
for (int ten = 0; changeAmount > 0.10; ten++) {
    changeAmount = changeAmount - 0.10
}
for (int five = 0; changeAmount > 0.5; five++) {
    changeAmount = changeAmount - 0.5
}
for (int two = 0; changeAmount > 0.2; two++) {
    changeAmount = changeAmount - 0.2
}
for (int one = 0; changeAmount > 0.1; one++) {
    changeAmount = changeAmount - 0.1
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
