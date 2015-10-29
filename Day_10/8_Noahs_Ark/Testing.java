/**
* This class will test all the methods and possible outcomes
*/
public class Testing {
	public static void main(String[] args) {
		/**
		 * Launching test script
		 */
		Testing launcher = new Testing();
		launcher.launch();
	}
	public void launch(){
		/**
		* Constructing all types of animals
		*/
		Oviporous snake = new O_Land("Snake");
		Oviporous lizard = new O_Land("Lizard");
		Oviporous frog = new O_Land("Frog");
		Oviporous beetle = new O_Land("Beetle");

		Oviporous pigeon = new O_Birds("Snake");
		Oviporous eagle = new O_Birds("Lizard");
		Oviporous fly = new O_Birds("Fly");

		Oviporous crocodile = new O_Aquatic("Crocodile");
		Oviporous salmon = new O_Aquatic("Salmon");
		
		Mammal bear = new M_Land("Bear");
		Mammal cat = new M_Land("Cat");
		Mammal dog = new M_Land("Dog");
		Mammal monkey = new M_Land("Monkey");

		Mammal dolphin = new M_Aquatic("Dolphin");
		Mammal whale = new M_Aquatic("Whale");
		Mammal shark = new M_Aquatic("Shark"); //sharks are not mammals but give birth to live offspring 

		/**
		* Testing methods for all mammals (excluding aquatic)
		*/
		bear.call();
		bear.giveBirth();
		bear.makeSound();
		System.out.println("");
		cat.call();
		cat.giveBirth();
		cat.makeSound();
		System.out.println("");
		dog.call();
		dog.giveBirth();
		dog.makeSound();
		System.out.println("");
		monkey.call();
		monkey.giveBirth();
		monkey.makeSound();
		System.out.println("");

		/**
		* Testing methods for all insects
		*/
		fly.call();
		fly.layEggs();
		fly.makeSound();
		System.out.println("");
		beetle.call();
		beetle.layEggs();
		beetle.makeSound();
		System.out.println("");

		/**
		* Testing methods for all reptiles
		*/
		crocodile.call();
		crocodile.layEggs();
		crocodile.makeSound();
		System.out.println("");
		snake.call();
		snake.layEggs();
		snake.makeSound();
		System.out.println("");

		/**
		* Testing methods for all aquatic animals (excluding crocodile)
		*/
		dolphin.call();
		dolphin.giveBirth();
		dolphin.makeSound();
		System.out.println("");
		salmon.call();
		salmon.layEggs();
		salmon.makeSound();
		System.out.println("");
		shark.call();
		shark.giveBirth();
		shark.makeSound();
		System.out.println("");
		whale.call();
		whale.giveBirth();
		whale.makeSound();
		System.out.println("");

		/**
		* Testing methods for all birds
		*/
		pigeon.call();
		pigeon.layEggs();
		pigeon.makeSound();
		System.out.println("");
		eagle.call();
		eagle.layEggs();
		eagle.makeSound();
		System.out.println("");

		/**
		* Testing methods for all amphibians
		*/
		frog.call();
		frog.layEggs();
		frog.makeSound();
		System.out.println("");
		lizard.call();
		lizard.layEggs();
		lizard.makeSound();

	}
}

/**
* Output:
*
*	Bear coming...
*	Bear has given birth to a healthy baby Bear
*	Bear says: *grrrrrr...*
*
*	Cat coming...
*	Cat has given birth to a healthy baby Cat
*	Cat says: *meow*
*
*	Dog coming...
*	Dog has given birth to a healthy baby Dog
*	Dog says: *bark*
*
*	Monkey coming...
*	Monkey has given birth to a healthy baby Monkey
*	Monkey says: *oooh oooh eeeh aaah* 
*
*	Fly now flying, will come later when tired...
*	Fly has layed eggs.
*	Fly says: *zzzzzzzzzzz...*
*
*	Beetle coming...
*	Beetle has layed eggs.
*	Beetle says: *zzzzzzzzzzz...*
*
*	Crocodile will not come...
*	Crocodile has layed eggs.
*	Crocodile says: *underwater bubble sound*
*
*	Snake coming...
*	Snake has layed eggs.
*	Snake says: *hissssssssssss...* 
*
*	Dolphin will not come...
*	Dolphin has given birth to a healthy baby Dolphin
*	Dolphin says: *eeeek eeeek....*
*
*	Salmon will not come...
*	Salmon has layed eggs.
*	Salmon says: *underwater bubble sound*
*
*	Shark will not come...
*	Shark has given birth to a healthy baby Shark
*	Shark says: *chomp chomp
*
*	Whale will not come...
*	Whale has given birth to a healthy baby Whale
*	Whale says: *eeeek eeeek....*
*
*	Snake coming...
*	Snake has layed eggs.
*	Snake says: *hissssssssssss...* 
*
*	Lizard coming...
*	Lizard has layed eggs.
*	Lizard says: *hissssssssssss...* 
*
*	Frog coming...
*	Frog has layed eggs.
*	Frog says: *rrriiibiiit* 
*
*	Lizard coming...
*	Lizard has layed eggs.
*	Lizard says: *hissssssssssss...*
*/