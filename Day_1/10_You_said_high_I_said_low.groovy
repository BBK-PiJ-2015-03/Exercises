// Task: 
// Modify your former program so that it outputs ”Yes” when the numbers are
// consecutive, regardless of whether they go up or down. For example, both
// ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.

int i, p
String str, result, fresult = "empty"
boolean finished = false, up = true, down = true
println "Enter a sequence of numbers (end with -1)"
print "> "
str = System.console().readLine()
i = Integer.parseInt(str)
while (!finished) {
    p = i
    print "> "
    str = System.console().readLine()
    i = Integer.parseInt(str)
    if (i == p) {
        fresult = "No"
    } else if (i > p) {
        result = "Yes"
        up = false
        finished = true
    } else if (i < p) {
        result = "Yes"
        down = false
        finished = true
    }
}
while (!up) {
    p = i
    print "> "
    str = System.console().readLine()
    i = Integer.parseInt(str)
    if (i == -1) {
    up = true
    } else if (i > p) {
        result = "Yes"
    } else {
        result = "No"
    }
    if (result == "No") {
        fresult = result
    }
}
while (!down) {
    p = i
    print "> "
    str = System.console().readLine()
    i = Integer.parseInt(str)
    if (i == -1) {
    down = true
    } else if (i < p) {
        result = "Yes"
    } else {
        result = "No"
    }
    if (result == "No") {
        fresult = result
    }
}
if (fresult == "empty") {
    println result
} else {
    println fresult
}
