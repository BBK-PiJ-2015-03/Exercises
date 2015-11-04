/* Look at the following code. Is there anything you can do to make this code better? Hint: you may need to convert
between types (e.g. casting)

public class Comparator {
	public int getMax(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		if (n1 > n2) {
			return number1;
		} else {
			return number2;
		}
	}
} */

public class Comparator {

	public static void main(String[] args) {
		Comparator compare = new Comparator();
		System.out.println(compare.getMax(1,5));
		System.out.println(compare.getMax(4.8,4.2));
		System.out.println(compare.getMax("1","5"));
	}

	public int getMax(int n, int m) {
		return (int) getMax((double) n,(double) m);
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	} 

	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		return "" + getMax(n1, n2);
	}
}