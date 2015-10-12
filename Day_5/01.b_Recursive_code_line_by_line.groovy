/*TASK
Do you see anything wrong with the following code? How would you fix it?
String buggyMethod(int n) {     // Indicates that we must return a string
	if (n == 0) {
		return "";
	}
	return n + " " + buggyMethod(n - 2);    // We need to return a string n is an Integer
} */

String buggyMethod(int n) {
if (n == 0) {
return "";
}
String p = n + " " + buggyMethod(n - 2); // This is now a string
return p // Returns the string
}

println buggyMethod(10)

/* Result of code is:
10 8 6 4 2
The code counts down from the integer put inside the parameters in two's untill it reaches
0, at this point it adds the result to a string with a space between out each count down.
*/
