/*TASK
Do you see anything wrong with the following code? How would you fix it?
String buggyMethod(int n) {
	if (n == 0) {
		return "";
	}
	return n + " " + buggyMethod(n - 2);
} */

String buggyMethod(int c) {
    if (c == 0) {
    return "";
    }
    String n = c + " " + buggyMethod(c - 2); //n is now a string
    return n
}
println buggyMethod(10)

/* Result of code is:
01	10 8 6 4 2
*/
