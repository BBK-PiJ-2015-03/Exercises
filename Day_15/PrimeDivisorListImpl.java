import java.util.ArrayList;

public class PrimeDivisorListImpl implements PrimeDivisorList{

	public String toString(){
		//Method needs to be implemented - I am unsure how to go about it
		return "Hello";
	}

	
	public boolean isPrime(int number) {
    for(int i = 2; i < number; i++) {
        if(number % i == 0)
            return false;
    }
    	return true;
	}

	public int primeInput(String num) throws NullPointerException, IllegalArgumentException{
		if(num.equals("")){
			throw new NullPointerException();
		}
		int n = Integer.parseInt(num);
		if(!isPrime(n)){
			throw new IllegalArgumentException();
		}
		return n;
	}

	public void header(){
		System.out.println("*------------------*");
		System.out.println("|  Prime List v1.0 |");
		System.out.println("*------------------*");
	}

	public static void main(String[] args) {
		PrimeDivisorListImpl pl = new PrimeDivisorListImpl();
		pl.header();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		boolean finished = false;
		while(!finished){
			System.out.print("Prime Number: ");
			int prime = pl.primeInput(System.console().readLine());
			primeList.add(prime);
			System.out.println("Added!");
			System.out.println("Would you like to add another? (Y/N)");
			String str = System.console().readLine();
			if(str.equals("n") || str.equals("N")){
				finished = true;
			} else if (str.equals("Y") || str.equals("y")){
				//do nothing
			} else {
				throw new IllegalArgumentException();
			}
		}

	}
}