// Question:
//Is there anything wrong with the following piece of code (hint: yes)? What does it do?
// Answer: 
// 'i' is more than 5 so the while statement will never run
// if 'i' was 4 it would check if 4 is less than 5 then add 1 (i++) then print 5 
// then check again that if it was less than 5 and stop
int i = 10
while (i < 5) {
	i++;
	println i
}
