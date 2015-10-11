/*TASK
Write a method that calculates the maximum size of the stack (measured in method calls) by forcing a StackOverflowError.
Use different methods, which different number and types of local variables, and see how the number of maximum
function calls changes.*/

int stackOverflowError(int c) {
    c++
    println c
    int d = stackOverflowError(c)
}

stackOverflowError(2)

//5473 is the maximum size of the stack before the stackOverflowError occurs
