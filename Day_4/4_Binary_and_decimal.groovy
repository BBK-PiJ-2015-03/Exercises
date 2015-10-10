/*TASK
Create a program in which you define the following methods:
binary2decimal(String): Takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 101 + 5 · 100, you can find that 100011 = 1 · 25 + 1 · 21 + 1 · 20
decimal2binary(int): The opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time (the quotients and
the last remainder will give you the binary number).
The program must offer a menu to the user with two options. The first one takes a binary number from the
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number
and returns a binary number. The program should use the methods defined */

class Binary {
    int dInput
    String bInput
}
String binary2decimal (String binary) {
    boolean bin1 = false
    for (;!bin1;) {
        int count = 1, num, total = 0
        String decimal
        for (int tLength = binary.length() - 1; tLength > -1 ; tLength = tLength-1) {
            decimal = binary.charAt(tLength)
            num = Integer.parseInt(decimal)
            if (num == 1) {
                total = total + (num*count)
            }
            count = count * 2;
        }
        bin1 = true
        return total;
    }
}
int decimal2binary(int num) {
    String strBinary = ""
    for (;num !=0;) {
        strBinary = (num%2) + strBinary
        num = num/2
    }
    num = Integer.parseInt(strBinary)
    return num
}
Binary bin = new Binary()
println "Binary and Decimal Converter"
println "What would you like to convert?"
println "1 - Binary to Decimal"
println "2 - Decimal to Binary"
print "> "
String choice = System.console().readLine()
switch (choice) {
    case "1":
        print "Enter Binary Number: "
        bin.bInput = System.console().readLine()
        println bin.bInput + " in binary is equal to " + binary2decimal(bin.bInput) + " in decimal."
        break;
    case "2":
        print "Enter Decimal Number: "
        bin.dInput = Integer.parseInt(System.console().readLine())
        println bin.dInput + " in decimal is equal to " + decimal2binary(bin.dInput) + " in binary."
}
