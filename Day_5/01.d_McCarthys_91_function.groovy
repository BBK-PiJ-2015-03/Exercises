/* TASK
Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
double.*/
int mcCarthy91(int n) {
	if (n > 100) {
		return n - 10;
	} else {
		return mcCarthy91(mcCarthy91(n+11));
	}
}
/*(Hint: If you get too confused, maybe writing a slightly modified version of this code that prints the numbers
on screen can help). */

/* I found this method slightly confusing so I did run the method
results where 91 for all arguments up untill 101 */
