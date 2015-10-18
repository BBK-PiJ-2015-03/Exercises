public class Marks {
	private int marks = 0, dist = 0, pass = 0, fail = 0, invl = 0;
	private String str;
	public void calculateMarks(Marks term) {
		do {
			System.out.println("Enter Student Marks (1 - 100)");
			System.out.print("> ");
			term.str = System.console().readLine();
			term.marks = Integer.parseInt(str);
			if (term.marks < 101 && term.marks > 69){
				term.dist++;
			} else if (term.marks < 70 && term.marks > 49){
				term.pass++;
			} else if (term.marks < 50 && term.marks > -1){
				term.fail++;
			} else {
				term.invl++;
			}
		} while (term.marks != -1);
		
		//Prints Results
		System.out.println(this.term.dist + " Distinctions");
		System.out.println(this.term.pass + " Passes");
		System.out.println(this.term.dist + " Failed");
		System.out.println(this.term.dist + " Invalid");
	}
}