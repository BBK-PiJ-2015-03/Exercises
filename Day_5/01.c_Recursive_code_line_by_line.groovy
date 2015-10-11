/*TASK
Do you see anything wrong with the following code? How would you fix it?
String doggyMethod(int n) {
	String result = doggyMethod(n-3) + n + doggyMethod(n-2);
	if (n <= 0) {
		return "";
	}
	return result;
} */

String doggyMethod(int n) {
    if (n <= 0) {	// moved to the start of method
        return "";
    }
    String result = doggyMethod(n-3) + n + doggyMethod(n-2);
    return result;
}

/* The if statement has been moved to the start of the method to prevent 
the code looping forever or untill it runs out of memory */
