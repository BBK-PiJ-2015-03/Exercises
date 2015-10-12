/*TASK
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.*/

//Iterative version
int numFactorial(int n) {
    if (n < 2) {
        return n;
    } else {
        for (int i = n-1; i != 0; i = i-1) {
            n = (n * i)
        }
    return n
    }
}

//Recursive version (Had help from the 'basic recursion' document)
int numFactorial(int n) {
    if (n < 2) {
        return n;
    } else {
        return n * numFactorial(n-1);
    }
}
println numFactorial(12)

/* Result of above code is
    479001600
*/    
