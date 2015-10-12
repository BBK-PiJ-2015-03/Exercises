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
public class Calculator {
    private double x
    private double y
    public void add(int x, int y) {
        println x+y
    }
    public void subtract(int x, int y) {
        println x-y
    }
    public void multiply(int x, int y) {
        println x*y
    }
    public void divide(int x, int y) {
        this.x = (double) x
        this.y = (double) y
        println this.x/this.y
    }
    public void modulus(int x, int y) {
        println x%y
    }
}

Calculator calc = new Calculator()

//Testing Addition
System.out.print("16 + 14 = ")
calc.add(16,14)

//Testing Subtration
System.out.print("6 - 3 = ")
calc.subtract(6,3)

//Testing Multiplication
System.out.print("11 x 5 = ")
calc.multiply(11,5)

//Testing Division
System.out.print("25 / 4 = ")
calc.divide(25,4)

//Testing Modulus
System.out.print("14 % 6 = ")
calc.modulus(14,6)



