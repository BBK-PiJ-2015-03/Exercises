//TASK
//Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
//addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the
//calculator performs the operation.
//Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Double.parseDouble()
//method to parse real numbers.

Double total
println "Calculator v1.0"
println "Enter a number"
print "> "
Double firstNum = Double.parseDouble(System.console().readLine())
println "Enter Operation [ADD, SUBTRACT, MULTIPLY, DIVIDE]"
print "> "
String str = System.console().readLine()
println "Enter a number"
print "> "
Double secondNum = Double.parseDouble(System.console().readLine())
switch (str) {
    case "ADD":
        println firstNum + " + " + secondNum + " = " + (firstNum + secondNum)
        break;
    case "SUBTRACT":
        println firstNum + " - " + secondNum + " = " + (firstNum - secondNum)
        break;
    case "MULTIPLY":
        println firstNum + " * " + secondNum + " = " + (firstNum * secondNum)
        break;
    case "DIVIDE":
        println firstNum + " / " + secondNum + " = " + (firstNum / secondNum)
        break;
}
