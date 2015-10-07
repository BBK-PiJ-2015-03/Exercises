// Now modify your program to write each word (as defined by spaces) rather than letter on a different line.

int textLength, check, nChar = 1
print "Enter text: "
String str = System.console().readLine()
textLength = str.length()
for (check = 0; textLength != check; check++) {
    print str.substring(check,nChar)
    if (str.substring(check,nChar) == " ") {
        println ""
    }
    nChar++
}
