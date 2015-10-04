// Task:
// Read an arbitrarily long sequence of positive numbers from the user, until -1
// is entered. At that point, print ”Yes” if the numbers were consecutive and
// increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-
// 1” should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1”
// should output ”No”.

int i, p
String str, result, fresult = "empty"
boolean finished = false
println "Enter a sequence of numbers (end with -1)"
while (!finished) {
    p = i
    print "> "
    str = System.console().readLine()
    i = Integer.parseInt(str)
    if (i == p) {
        fresult = "No"
    } else if (i == -1) {
        finished = true
    } else if (i > p) {
        result = "Yes"
    } else if (i < p) {
        fresult = "No"
    }
}
if (fresult == "empty") {
    println result
} else {
    println fresult
}
