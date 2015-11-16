/**
* 1. Code Flow
* 
* Look at the following code and write the code flow (use the line numbers to indicate which lines are executed in
* which order) in the following situations:
* 
* Q) userInput is 0.
* A) 1 - 21(Exception on line 21), 24-27
* 
* Q) userInput is 2.
* A) 1 - 17(Exception on line 17), 24-27
* 
* Q) userInput is 4
* A) 1 - 13(Exception on line 13), 24-27
* 
* Q) userInput is 6.
* A) 1 - 11(Exception on line 11), 24-27
* 
* 01 public void launch(int userInput) {
* 02 List<Integer> intList = new ArrayList<Integer>();
* 03 intList.add(1);
* 04 intList.add(2);
* 05 intList.add(3);
* 06 intList.add(4);
* 07 intList.add(5);
* 08 intList.add(6);
* 09 try {
* 10 intList.remove(0);
* 11 System.out.println(intList.get(userInput));
* 12 intList.remove(0);
* 13 System.out.println(intList.get(userInput));
* 14 intList.remove(0);
* 15 System.out.println(intList.get(userInput));
* 16 intList.remove(0);
* 17 System.out.println(intList.get(userInput));
* 18 intList.remove(0);
* 19 System.out.println(intList.get(userInput));
* 20 intList.remove(0);
* 21 System.out.println(intList.get(userInput));
* 22 intList.remove(0);
* 23 System.out.println(intList.get(userInput));
* 24 } catch (IndexOutOfBoundsException ex) {
* 25 ex.printStackTrace();
* 26 }
* 27 }
* Incorporate this code into a simple class to verify your answers. 27 }
* Incorporate this code into a simple class to verify your answers.
*
*/