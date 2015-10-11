/*TASK
What number would the following method print on screen if you called printNumbers(6)?
void printNumbers(int n) {
	if (n <= 0) {
		return;
	}
	printLine(n);
	printNumbers(n-2);
	printNumbers(n-3);
	printLine(n);
}
Do this exercise on paper. Then add this method to a Java Decaf program and check your answer.

The above code will print the following will print;

01	6	//fist in stack
02	4	//second in stack
03	2	//third in stack
04	3	//second in stack
05	6	//first in stack

However I have tried to execute (using groovy not Java Decaf) the code and receive the following error;
Caught: groovy.lang.MissingMethodException: No signature of method: main.printLine() is applicable for argument types: (java.lang.Integer) values: [6] 
Possible solutions: println(), println(), println(java.lang.Object), println(java.io.PrintWriter), println(java.lang.Object), print(java.lang.Object)  
groovy.lang.MissingMethodException: No signature of method: main.printLine() is applicable for argument types: (java.lang.Integer) values: [6]         
Possible solutions: println(), println(), println(java.lang.Object), println(java.io.PrintWriter), println(java.lang.Object), print(java.lang.Object)  
        at main.printNumbers(main.groovy:5)                                                                                                            
        at main.run(main.groovy:11)

I have executed the following in groovy;

void printNumbers(int n) {
    if (n <= 0) {
    return;
    }
    println n;
    printNumbers(n-2);
    printNumbers(n-3);
    println n;
}

printNumbers(6)

the results where;

6                                                                                                                                                      
4                                                                                                                                                      
2                                                                                                                                                      
2                                                                                                                                                      
1                                                                                                                                                      
1                                                                                                                                                      
4                                                                                                                                                      
3                                                                                                                                                      
1                                                                                                                                                      
1                                                                                                                                                      
3                                                                                                                                                      
6  

I am not sure how to execute in Java Decaf (using mac) but will look at this later,

if the results above are the same when executed in Java Decaf then I have answered wrong. */
