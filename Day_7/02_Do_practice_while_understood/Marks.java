public class Marks {
	private int marks = 0, dist = 0, pass = 0, fail = 0, invl = 0, c = 0;
	private String str;
	public void calculateMarks(Marks term) {
		do {
			System.out.print("Input a mark: ");
			term.str = System.console().readLine();
			term.marks = Integer.parseInt(str);
			if (term.marks < 101 && term.marks > 69){
				c++;
				term.dist++;
			} else if (term.marks < 70 && term.marks > 49){
				c++;
				term.pass++;
			} else if (term.marks < 50 && term.marks > -1){
				c++;
				term.fail++;
			} else if (term.marks != -1){
				term.invl++;
			}
		} while (term.marks != -1);
		
		//Prints Results
		System.out.println("There are " + c + " students: "
							+ term.dist + " distinctions, "
							+ term.pass + " pass, "
							+ term.fail + " fails "
							+ "(plus " + term.invl + " invalid).");
	}
}