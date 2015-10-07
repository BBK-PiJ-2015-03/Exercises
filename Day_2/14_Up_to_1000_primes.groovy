//Task:
//Modify the program that you wrote for the former exercise so that it writes on screen the first 1,000 primes.

int n = 2, r, c, pc, p
boolean finished = false
while (!finished) {
    if (pc == 1000) {
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
    pc++
    print p + ", "
    }
}
