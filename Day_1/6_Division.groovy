// Question:
// Write a program that requests two numbers from the user and then outputs the
// quotient and the remainder, e.g. if the user enters 7 and 3, your program should
// ouput something like “7 divided by 3 is 2, remainder 1”. You cannot use the
// “/” or “%” operators

boolean finished = false
int num1, num2, total, count
String str
println "Devision Calculator"
println "Enter a number"
print "> "
str = System.console().readLine()
num1 = Integer.parseInt(str)
println "Enter another number"
print "> "
str = System.console().readLine()
num2 = Integer.parseInt(str)
while (!finished) {
    total++;
    num1 = num1 - num2
    if (num1 == 0) {
        finished = true
        println total
    } else if (num1 < 0) {
        println num1 + " cannot be divided by " + num2
        finished = true
    }
}
