//TASK
//Then modify the program so that it reads the text from the user and then asks for a letter. The program should
//then say how many times you can find the letter in the text.
int count, textLength, check, nChar = 1
boolean valid = false

//User input of text and a letter to check repetition
print "Enter text: "
String str = System.console().readLine()
print "Enter a letter: "
String letter = System.console().readLine()

//Count how many times that letter is repeated
textLength = str.length()
for (check = 0; textLength != check; check++) {
    if (str.substring(check,nChar) == letter) {
        count++
    }
    nChar++
}

//Print result
println "The letter " + letter + " is repeated " + count + " time(s) in the text"
println str
