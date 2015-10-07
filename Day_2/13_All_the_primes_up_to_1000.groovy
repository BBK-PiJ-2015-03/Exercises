// Task:
// Write a program that prints all on screen all prime numbers up to 1,000.

int rem, count, num, prime
boolean finished1 = false, finished2 = false
while (!finished1) {
    num++
    while (!finished2) {
        count++
        rem = num % count
        if (num == count) {
            finished2 = true
        } else if (rem != 0) {
            prime = num
        } else if (rem == 0) {
            prime = 0
        }
    }
    if (prime != 0) {
        println prime ", "
    }
    if (prime > 1000) {
        finished1 = true
    }
}    
