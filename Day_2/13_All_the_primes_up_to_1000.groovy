// Task:
// Write a program that prints all on screen all prime numbers up to 1,000.

int n = 2, r, c, p
boolean finished = false
while (!finished) {
    if (n == 1000) {
        finished = true
        break;
    }
    n++
    for (c = 2; n != c; c++) {
        r = n % c
        if (r != 0) {
            p = n
        } else {
            p = -1
            break;
        }
    } 
    if (p != -1) {
        print p + ", "
    }
}
