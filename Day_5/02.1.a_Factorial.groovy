/*TASK
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.*/

//Iterative version
int numFactorial(int n) {
    for (int i = n-1; i != 0; i = i-1) {
        n = (n * i)
    }
    return n
}

//Recursive version (did have help from the 'basic recursion' document)
int numFactorial(int n) {
    if (n == 1) {
        return n;
    } else {
    int i = n-1
    n = n*numFactorial(i)
    return n
    }
}
println numFactorial(5)


