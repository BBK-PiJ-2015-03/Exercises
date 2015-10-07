Write a program that reads some text from the user and then writes the same text on screen, but each letter on a
different line.
// Now modify your program to write each word (as defined by spaces) rather than letter on a different line.
// Modified version will be named 04_Line_to_column_modified.groovy

int textLength, check, nChar = 1
print "Enter text: "
String str = System.console().readLine()
textLength = str.length()
for (check = 0; textLength != check; check++) {
    println str.substring(check,nChar)
    nChar++
}
