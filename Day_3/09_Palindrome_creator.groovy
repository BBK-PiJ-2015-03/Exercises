//TASK
//Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed
//by the same text in reversed order. For example, if the user enters the text “It was a dark and stormy night” the
//program must output “It was a dark and stormy nightthgin ymrots dna krad a saw tI”.

int count, textLength, check
String reversedStr = ""
print "Enter text: "
String str = System.console().readLine()
textLength = str.length()
count = textLength

//Revereses the text
for (check = 0; textLength != check; check++) {
    reversedStr = reversedStr + str.substring(count - 1,count)
    count = count - 1
    }

//Combines original input with reversed text to create a Palindrome
println str + reversedStr
