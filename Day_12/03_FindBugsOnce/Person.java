public class Person{

	public String getInitial(String fullName){
		String result = "";
		String[] words = fullName.split(" "); // Space was missing inside parameters
		for (int i = 0; i < words.length; i++){
			String nextInitial = "" + words[i].charAt(0);
			result += nextInitial.toUpperCase();
		}
		return result;
	}

}