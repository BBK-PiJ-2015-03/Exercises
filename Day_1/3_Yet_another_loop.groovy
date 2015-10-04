// Question:
// What does the following piece of code do?
// Answer:
// The program asks a user for an input (must be a number) this input is 'i'
// if 'i' is less than 10 the program will add 1 to 'i'
// It will then ask the user for another input (must be a number) this input is 'j'
// if 'j' is '0' it will stop the while loop and print 'finished'
// if 'j' is not equal to '1' the program will print 'j' and check if 'i' is less than 10, if so it will continue the while loop, other wise it will stop and print 'finished'
// if 'j' is '1' it will not print anything, it will check if 'i' is less than 10 to continue the while loop, if it is not it will print 'finished'

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
	i++;
	String str = System.console().readLine()
	int j = Integer.parseInt(str)
	if (j == 0) {
		break;
	} else if (j != 1) {
		println j;
	}
}
System.out.println("finished");
