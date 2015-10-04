// Question:
// Write a program that reads three numbers and prints them in order, from lowest
// to highest.

int num1, num2, num3
String str
println "Please input 3 numbers"
print "1st Number:  "
str = System.console().readLine()
num1 = Integer.parseInt(str)
print "2nd Number:  "
str = System.console().readLine()
num2 = Integer.parseInt(str)
print "3rd Number:  "
str = System.console().readLine()
num3 = Integer.parseInt(str)
if (num1 > num2 && num2 > num3) {
    println num3 + ", " + num2 + ", " + num1
} else if (num2 > num3 && num3 > num1) {
    println num1 + ", " + num3 + ", " + num2
} else if (num3 > num2 && num2 > num1) {
    println num1 + ", " + num2 + ", " + num3
} else if (num2 > num1 && num1 > num3) {
    println num3 + ", " + num1 + ", " + num2
} else if (num1 > num3 && num3 > num2) {
    println num2 + ", " + num3 + ", " + num1
}
