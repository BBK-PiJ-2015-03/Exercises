//TASK
//A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either
//direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”.
//Write a program that reads a text and detects whether the text is a strict palindrome.
int count, textLength, check
String pStr = ""
print "Enter text: "
String str = System.console().readLine()
textLength = str.length()
count = textLength

//Revereses the text
for (check = 0; textLength != check; check++) {
    pStr = pStr + str.substring(count - 1,count)
    count = count - 1
    }

//Checks if reversed text is equal to original input
if (pStr == str) {
    println "The text you entered is a strict palindrome"
} else {
    println "The text you entered is not a strict palindrome"
}
