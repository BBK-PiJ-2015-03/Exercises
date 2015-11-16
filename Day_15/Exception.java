/**
* Read the following code and check whether there is anything wrong with it. Then write some similar code and
* check your answer.
*
* // Some code here
* try {
* 	// more code here
* 	list.add(newElement);
* 	// more code here
* } catch (Exception ex) {
* 	ex.printStackTrace();
* } catch (NullPointerException ex) {
* 	ex.printStackTrace();
* }
*
*
* A) It seems that the first catch will apply to all exceptions so the second
* 	 catch is never reached, even if there is a NullPointerException.
*
*/