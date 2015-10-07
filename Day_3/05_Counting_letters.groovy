//TASK
//Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.
//Then modify the program so that it reads the text from the user and then asks for a letter. The program should
//then say how many times you can find the letter in the text. - Modified version will be named 05_Counting_letter_modified.groovy

int count, textLength, check, nChar = 1
print "Enter text: "
String str = System.console().readLine()
textLength = str.length()
for (check = 0; textLength != check; check++) {
    if (str.substring(check,nChar) == "e") {
        count++
    }
    nChar++
}
println "The letter 'e' is repeated " + count + " time(s) in the text"
println str
