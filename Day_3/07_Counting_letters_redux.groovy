//TASK
//Write a program that reads a text from the user and then enter a loop of requesting letters and counting them.
//The program stops if the user asks for the same letter twice. This is an example of the output of such a program
//(with a rather short and boring text):
int i1, i2, i3 ,i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26
int count, textLength, check, nChar = 1
boolean dupe = false

//User input of text
print "Please write a text: "
String str = System.console().readLine()

//User input of letter to count
while (!dupe) {
    print "Which letter would you like to count now? "
    String letter = System.console().readLine()

    //Count amount of times letter is entered
    switch (letter) {
         case "a":
            i1++
            break;
        case "b":
            i2++
            break;
        case "c":
            i3++
            break;
        case "d":
            i4++
            break;
        case "e":
            i5++
            break;
        case "f":
            i6++
            break;
        case "g":
            i7++
            break;
        case "h":
            i8++
            break;
        case "i":
            i9++
            break;
        case "j":
            i10++
            break;
        case "k":
            i11++
            break;
        case "l":
            i12++
            break;
        case "m":
            i13++
            break;
        case "n":
            i14++
            break;
        case "o":
            i15++
            break;
        case "p":
            i16++
            break;
        case "q":
            i17++
            break;
        case "r":
            i18++
            break;
        case "s":
            i19++
            break;
        case "t":
            i20++
            break;
        case "u":
            i21++
            break;
        case "v":
            i22++
            break;
        case "w":
            i23++
            break;
        case "x":
            i24++
            break;
        case "y":
            i25++
            break;
        case "z":
                i26++
            break;
    }

    //Check if a letter has been entered twice
    if (i1 == 2 || i2 == 2 || i3 == 2 || i4 == 2 || i5 == 2 || i6 == 2 || i7 == 2 || i8 == 2 || i9 == 2 || i10 == 2 || i11 == 2 || i12 == 2 || i13 == 2 || i14 == 2 || i15 == 2 || i16 == 2 || i17 == 2 || i18 == 2 || i19 == 2 || i20 == 2 || i21 == 2 || i22 == 2 || i23 == 2 || i24 == 2 || i25 == 2 || i26 == 2) {
        dupe = true
        println "Repeated character. Exiting the program..."
        println "Thank you for your cooperation. Good bye!"
        break;
    }

    //Count how many times that letter is repeated
    textLength = str.length()
    for (check = 0; textLength != check; check++) {
        if (str.substring(check,nChar) == letter) {
            count++
        }
        nChar++
    }

    //Print result
    println "There are " + count + " in your text"
}

