// Question:
// Write a program that asks a number from the user, then says whether the
// number is prime or not. Remember that a number that is divisible by any
// number apart from 1 and itself is prime. You can use the modulo operator (if
// a % b is zero, then a is divisible by b).
// Answer:

boolean finished = false
int rem,count = 1
String result
println "Enter a number"
print "> "
String str = System.console().readLine()
int num = Integer.parseInt(str)
while (!finished) {
    count++;
    rem = num % count
    if (num == count) {
        finished = true
    } else if (rem != 0) {
        result = "Prime"
    } else if (rem == 0) {
        result = "Not"
        break;
    } 
}
println result
