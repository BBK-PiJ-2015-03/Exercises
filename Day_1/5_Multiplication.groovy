// Question:
// Write a program that requests two numbers from the user and then outputs its
// product. You cannot use the “*” operator.

boolean finished = false
int num1, num2, total, count = 0
String str
println "Multiplication Calculator"
println "Enter a number"
print "> "
str = System.console().readLine()
num1 = Integer.parseInt(str)
println "Enter another number"
print "> "
str = System.console().readLine()
num2 = Integer.parseInt(str)
while (!finished) {
    count++;
    total = num1 + total
    if (count == num2) {
        finished = true
    }
}
println total
