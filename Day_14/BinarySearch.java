import java.util.Arrays;
import java.lang.Math;

public class BinarySearch {
	private int[] intArray = null;

	public static void main(String[] args) {
		BinarySearch m = new BinarySearch();
		m.makeArray();
	}

	private void makeArray(){
		this.intArray = new int[1000];
		for(int i = 0; i < this.intArray.length; i++){
			int num = (int) Math.abs(2000 * Math.random());
			this.intArray[i] = num;
			System.out.println(num);
		}
		Arrays.sort(intArray);
	}

	private boolean initialAction(int n){
		if(this.intArray.length == 0){
			return false;
		}
		for(int i = (this.intArray.length/2); i < this.intArray.length; ){
			if(this.intArray[i] == n){
				return true;
			}
			if(i < n){
				i = (i/2);
			}
			if(i < n){
				i = (this.intArray.length-i)+(i/2);
			}
		}
		return false;
	}
}