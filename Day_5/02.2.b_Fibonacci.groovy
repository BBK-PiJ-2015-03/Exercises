/*Write a small program with a method that calculates the nth element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare the time that is needed in each case
to find F(40) or F(45).*/

//Method of Fibonacci
int F(int e) {
    if (e == 1 || e == 2) {
        return 1
    } else {
        int total, n1 = 1, n2 = 1
        for (int u = 3; u <= e; u++) {
        total = n1 + n2
        n1 = n2
        n2 = total
        }
    return total
    }
}

//Execution of code starts here
String Str
int Count
println "Which number of the Fibonacci sequence would you like"
print "> "
Str = System.console().readLine()
Count = Integer.parseInt(Str)
println F(Count)

