import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Test begin = new Test();
		begin.launch();

	}

	public void launch(){
		ListUtilities L = new ListUtilities();

		System.out.print("Enter size of array: ");
		int size = Integer.parseInt(System.console().readLine());
		L.newArray(size);
		for(int i = 0 ; i < L.size ; i++){
			System.out.print("Set Array[" + i + "]: ");
			int value = Integer.parseInt(System.console().readLine());
			L.setArray(value, i); 
		}
 		
		System.out.println("");
 		System.out.println("Array values have been stored!");
		

		System.out.println("");
		System.out.println("Array will now be sorted and converted to a list");
		Arrays.sort(L.listArray); //sort array in acending order
		for(int i = 0 ; i < L.size ; i++){
			L.arrayToList(L.listArray[i]); 
		}


		System.out.println("List values have been stored!");
		L.printList();
		System.out.println("");
		

	}

}