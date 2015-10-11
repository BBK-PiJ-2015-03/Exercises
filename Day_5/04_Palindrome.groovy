/*TASK
Create a program with a (recursive) method that takes a String paremeter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks.
Which one seems clearer to you?*/

//Method for palindrome check
void palindromeCheck(String text) {
    int textLength = text.length()
    int count = textLength
    String pStr = ""
    //Reverses the text
    for (int check = 0; textLength != check; check++) {
        pStr = pStr + text.substring(count - 1,count)
        count = count - 1
    }
    //Checks if reversed text is equal to original input
    if (pStr == text) {
    println " is a strict palindrome"
    return;
    } else {
    println " is not a strict palindrome"
    return;    
    }
}

//Execution of code starts here
print "Enter text: "
String str = System.console().readLine()
print str
palindromeCheck(str)



