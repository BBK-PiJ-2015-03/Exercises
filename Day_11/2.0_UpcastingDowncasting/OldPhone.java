/**
 * An old phone makes calls
 */
public class OldPhone implements Phone {
	private String brand = null;

	public OldPhone(String brand){
		/*
		* Sets phone brand
		*/
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}

	public void call(String number){
		System.out.println("Calling " + number + "...");
	}
}
