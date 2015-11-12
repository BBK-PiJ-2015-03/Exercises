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
public class mcCarthy91 {

	public static void main(String[] args) {
		mcCarthy91 n = new mcCarthy91();
		int num = Integer.parseInt(args[0]);
		System.out.println("Final: " + n.mcCarthy91(num));
		System.out.println("Input: " + num);


	}

	int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}	
}