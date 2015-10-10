/* TASK
Create your own version of boxed int! Create a class Integer2 with only one field (int value) and the following
methods:
getValue(): returns the value of this number as an int, a getter.
setValue(int): a setter.
isEven(): returns true if the number is even, false otherwise.
isOdd(): the opposite.
prettyPrint(): prints the value of the integer on the screen.
toString(): returns a String equivalent to the number. */

class Integer2 {
    int value
    int getValue() {
        return this.value
    }
    int setValue (int s) {
        this.value = s
    }
    boolean isEven() {
        if ((this.value%2) == 0) {
            return true
        } else {
            return false
        }
    }
    boolean isOdd() {
        if ((this.value%2) == 0) {
            return false
        } else {
            return true
        }   
    }
    void prettyPrint() {
        println this.value
    }
    String toString() {
        String str = this.value
        return str
    }
}

//Checked this works by using the following program (provided in exercise)
Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}
