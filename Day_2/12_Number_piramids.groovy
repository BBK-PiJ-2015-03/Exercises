// Task:
// Write a program that output a number piramid like the one below.
// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777

int b, n = 1
boolean finished = false
while (!finished) {
    for (b = 0; b < n; b++) {
        print n
    }
    println ""
    n++;
    if (n == 8) {
        finished = true
    }
}