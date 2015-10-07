//TASK
//A strict palindrome is difficult to see in every day language. A relaxed palindrome, a text that is a palindrome if
//you ignore punctuation marks such as commas or spaces, is easier to see. Examples include “A man, a plan, a canal
//- Panama!”, “Was it a car or a cat I saw?”, and “Rise to vote, sir”.
//Write a program that reads a text from the user and then says whether the text is a relaxed palindrome. Note
//that all strict palindromes are relaxed palindromes by definition.
//Hint: There are two methods that will make your life easier. The first one is Character.isLetter(), that accepts
//a character (not a String, even of length one) and returns true if the character is a letter (e.g. ’a’, ’R’) and false
//otherwise (e.g. ’.’, ’5’). The second one is Character.toLowerCase(), that accepts a character (not a String) and
//returns the lower case version of the character.

String str, firstSentence = "", reversedSentence = ""
int textLength, count
char pstr, lstr
boolean b1 = false
println "Please enter a sentence: "
str = System.console().readLine()
textLength = str.length()
count = textLength

//Reverses text order, removes symbols and capital letters
for (int check = 0; textLength != check; check++) {
    temp = str.substring(count - 1,count)
    pstr = temp
    tstr = Character.toLowerCase(pstr)
    count = count -1
    if (Character.isLetter(tstr)) {
    reversedSentence = reversedSentence + tstr
    }
}

// Sets count back to original text length

// Puts text in entered order, removes any symbols or capital letters
for (int check = 0; textLength != check; check++) {
    temp = str.substring(check, check + 1)
    pstr = temp
    tstr = Character.toLowerCase(pstr)
    count = count -1
    if (Character.isLetter(tstr)) {
    firstSentence = firstSentence + tstr
    }
}

//Checks if the entered text is a relaxed palindrome and prints result
if (firstSentence == reversedSentence) {
    println "The text you entered is a relaxed palindrome"
} else {
    println "The text you entered is not a relaxed palindrome"
}
