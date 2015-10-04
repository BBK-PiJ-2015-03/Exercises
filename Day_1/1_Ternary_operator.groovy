// This program asks user for year of birth and deducts that from the 'current year' and output
// 'It seems you are an adult.' If you age is 18 or higher
// otherwise it will output 'It seems you are not an adult.' 
int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."
