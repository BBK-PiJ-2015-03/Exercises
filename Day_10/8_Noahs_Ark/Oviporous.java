/**
* This class is for animals that lay eggs
*/
public Oviporous implements Animal{
	private String species = null;
	
	public Oviporous(String species){
		this.species = species;
	}

	public void makeSound(){
		if ( this.species.equals("Crocodile") || this.species.equals("Salmon") || this.species.equals("Shark") ){
			System.out.println(this.species + " says: *underwater bubble sound*");
		} else if ( this.species.equals("Pigeon") {
			System.out.println(this.species + " says: *pock pock pock*");
		} else if (this.species.equals("Eagle") || this.species.equals("Flies")){
			System.out.println(this.species + " says: *caaaaaaaahhhhh* (high piched)");
		} else if (this.species.equals("Flies") || this.species.equals("Beetle") ){
			System.out.println(this.species + " says: *zzzzzzzzzzz...*");
		} else if (this.species.equals("Snake") || this.species.equals("Lizard")){
			System.out.println(this.species + " *hissssssssssss...* ")
		} else if (this.species.equals("Frog")){
			System.out.println(this.species + " *rrriiibiiit* ")	
		} else {
			System.out.println("Unrecognized species")
		}
	}

	public void call(){
		if ( this.species.equals("Crocodile") || this.species.equals("Salmon") || this.species.equals("Shark") ){
			System.out.println(this.species + " will not come...");
		} else if ( this.species.equals("Pigeon") || this.species.equals("Eagle") || this.species.equals("Flies")){
			System.out.println(this.species + " now flying, will come later when tired...");
		} else if ( this.species.equals("Snake") || this.species.equals("Beetle") || this.species.equals("Lizard") || this.species.equals("Frog")){
			System.out.println(this.species + " coming...")
		} else {
			System.out.println("Unrecognized species")
		}
	}

	/**
	* This method will call (e.g. cat call will be 'meow')
	*/
	public void reproduce(){
		layEggs();
	}

	public void layEggs(){
		System.out.println(this.species + " has layed eggs.");
	}
	
}