public class HailStoneNumbers {
	int[] arrayList = new int[30];
	
	public static void main(String[] args){
		HailStoneNumbers m = new HailStoneNumbers();
		m.toList(19);
		System.out.println(m.toString());
	}
	
	public int[] toList(int n){
		arrayList[0] = n;
		for(int i = 0; i < arrayList.length-1; i++){
			if(arrayList[i]%2 == 0){
				arrayList[i+1] = arrayList[i]/2;
			} else {
				arrayList[i+1] = (arrayList[i]*3)+1;	
			}
		}
		return arrayList;
	}
	
	public String toString(){
		String str = "";
		for(int i = 0; i < arrayList.length; i++){
			str += arrayList[i] + " | ";
		}
		return str;
	}
}
