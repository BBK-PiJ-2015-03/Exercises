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
void paperSize(int input, int w, int h) {
    if (input == 0) {
    println "D0000 Width x Height"
    return;
    } else { 
        for (int i = 0; input != i; i++) {
            h = w
            w = w / 2
            input = input -1
        }
        return;
    }
}

//Paper class
class Paper {
    int width
    int height
}

//Execution of code befins here
int D0000 = 0, D00 = 1, A0 = 2, A1 = 3, A2 = 4, A3 = 5, A4 = 6, A5 = 7, A6 = 8, A7 = 9, A8 = 10, A9 = 11, A10 = 12
Paper size = new Paper()
size.width = 1682
size.height = 2378
println "Page Sizes"
println "1 - D0000"
println "2 - D00"
println "3 - A0"
println "4 - A1"
println "5 - A2"
println "6 - A3"
println "7 - A4"
println "8 - A5"
println "9 - A6"
println "10 - A7"
println "11 - A8"
println "12 - A9"
println "13 - A10"
println "Enter Page Size: "
int input = Integer.parseInt(System.console().readLine())
switch (input) {
    case 1:
        input = D0000
        break;
    case 2:
        println "D00 Width x Height"
        input = D00
        break;
    case 3:
        println "A0 Width x Height"
        input = A0
        break;
    case 4:
        println "A1 Width x Height"
        input = A1
        break;
    case 5:
        println "A2 Width x Height"
        input = A2
        break;
    case 6:
        println "A3 Width x Height"
        input = A3
        break;
    case 7:
        println "A4 Width x Height"
        input = A4
        break;
    case 8:
        println "A5 Width x Height"
        input = A5
        break;
    case 9:
        println "A6 Width x Height"
        input = A6
        break;
    case 10:
        println "A7 Width x Height"
        input = A7
        break;
    case 11:
        println "A8 Width x Height"
        input = A8
        break;
    case 12:
        println "A9 Width x Height"
        input = A9
        break;
    case 13:
        println "A10 Width x Height"
        input = A10
        break;
}
paperSize(input, size.width, size.height)
println size.width + "mm x " + size.height + "mm"
