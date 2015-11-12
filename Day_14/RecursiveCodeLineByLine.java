/**
*	1 Recursive code, line by line
*	a)
*	Do you see anything wrong with the following code? How would you fix it?
*	String doggyMethod(int n) {
*		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
*		if (n <= 0) {
*			return "";
*		}
*	}
*/
public class RecursiveCodeLineByLine {

	public static void main(String[] args) {
		RecursiveCodeLineByLine n = new RecursiveCodeLineByLine();
		System.out.println(n.doggyMethod(10));
	}

	public String doggyMethod(int n) {
			if (n <= 0) {
				return "";
			}
			String result = doggyMethod(n-3) + n + doggyMethod(n-2);
			return result;
		}	
}