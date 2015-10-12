/* TASK
Create a Java class called Calculator. The class should implement the following methods, each of them printing
the result on the screen.
• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)
Note that you will will need to cast the parameters into double to perform exact division.
Write a small Groovy or Java Decaf program that uses all the methods of Calculator.
*/
class Calculator {
            double x
            double y
            int t
            int add(int x, int y) {
                this.t = x+y
                return t
            }
            int subtract(int x, int y) {
                return x-y
            }
            int multiply(int x, int y) {
                return x*y
            }
            double divide(int x, int y) {
                this.x = (double) x
                this.y = (double) y
                return this.x/this.y
            }
            int modulus(int x, int y) {
                return x%y
            }
}
System.out.println("Testing Addition: 14 + 16 = " + Calculator.add(14,16)) 
