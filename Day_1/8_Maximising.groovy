// Question:
// Write a program that read a (arbitrarily long) sequence of positive numbers.
// The sequence is ended when the users enters “-1”. At that point, the program
// must output the highest number in the sequence.

int max = 0, i
String str
boolean finished = false
println "Enter a sequence of numbers (end with -1)"
while (!finished) {
    print "> "
    str = System.console().readLine()
    i = Integer.parseInt(str)
    if (i == -1) {
        println max
        finished = true
    } else if (i > max) {
        max = i
    }
}
