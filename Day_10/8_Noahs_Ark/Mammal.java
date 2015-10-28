/**
* This class is for mammals.
*/
public Mammal implements Animal{
	private String species = null;
	
	public Mammal(String species){
		this.species = species;
	}

	public void makeSound(){
		if ( this.species.equals("Dolphin") || this.species.equals("Whale")){
			System.out.println(this.species + " says: *eeeek eeeek....*");
		} else if ( this.species.equals("Cat") {
			System.out.println(this.species + " says: *meow*");
		} else if (this.species.equals("Dog")){
			System.out.println(this.species + " says: *bark*");
		} else if (this.species.equals("Bear")){
			System.out.println(this.species + " says: *grrrrrr...*");
		} else if (this.species.equals("Whale") || this.species.equals("Lizard")){
			System.out.println(this.species + " *hissssssssssss...* ")
		} else if (this.species.equals("Monkey")){
			System.out.println(this.species + " *oooh oooh eeeh aaah* ")	
		} else {
			System.out.println("Unrecognized species")
		}
	}

	public void call(){
		if ( this.species.equals("Dolphin") || this.species.equals("Whale")){
			System.out.println(this.species + " will not come...");
		} else if ( this.species.equals("Bear") || this.species.equals("Car") || this.species.equals("Dog") || this.species.equals("Monkey")){
			System.out.println(this.species + " coming...")
		} else {
			System.out.println("Unrecognized species")
		}


	public void reproduce(){
		giveBirth();
	}

	public void giveBirth(){
		System.out.println(this.species + " has given birth to a healthy baby " + this.species);
	}
	
}