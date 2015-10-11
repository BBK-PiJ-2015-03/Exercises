/*TASK
A Din-A0 sheet of paper is 841mm × 1189mm (its surface is one square meter). Successive measurements of paper
are defined recursively as “half” or “double” the preceding size. Therefore, a Din-A1 sheet of paper is half of
Din-A0, or 594mm × 841mm; while a Din-A00 is double of Din-A0, or 1189mm× 1682mm.
Create a method that takes a String parameter representing a size (e.g. ”A4”, “A00000”) and prints on screen
the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors when calculating smaller
sizes.
Hint: note that two consecutive sizes always share one side and only the other one is multiplied or divided by
two, e.g. the short side of Din-A2 is as long as the long side of Din-A3, while the long side of Din-A2 is twice as
long as the short side of Din-A3.*/

// Method to calculate paper size
void paperSize(int input, Paper w, Paper h) {
    if (input == 0) {
    println "D0000 Width x Height"
    return;
    } else { 
        for (int i = 0; input != i; i++) {
            Paper.h = Paper.w
            Paper.w = Paper.w / 2
            println "Round"
        }
        return;
    }
}

//Paper class
class Paper {
    int w
    int h
}

//Execution of code begins here
Paper size = new Paper()
size.w = 1682
size.h = 2378
int choice
println "Enter Page Size: "
String input = System.console().readLine()
switch (input) {
    case "D000":
        choice = 0
        break;
    case "D00":
        println "D00 Width x Height"
        choice = 1
        break;
    case "A0":
        println "A0 Width x Height"
        choice = 2
        break;
    case "A1":
        println "A1 Width x Height"
        choice = 3
        break;
    case "A2":
        println "A2 Width x Height"
        choice = 4
        break;
    case "A3":
        println "A3 Width x Height"
        choice = 5
        break;
    case "A4":
        println "A4 Width x Height"
        choice = 6
        break;
    case "A5":
        println "A5 Width x Height"
        choice = 7
        break;
    case "A6":
        println "A6 Width x Height"
        choice = 8
        break;
    case "A7":
        println "A7 Width x Height"
        choice = 9
        break;
    case "A8":
        println "A8 Width x Height"
        choice = 10
        break;
    case "A9":
        println "A9 Width x Height"
        choice = 11
        break;
    case "A10":
        println "A10 Width x Height"
        choice = 12
        break;
}
paperSize(choice, size.w, size.h)
println size.w + "mm x " + size.h + "mm"
