public interface PersonQueue {
	/**
	* Adds another person to the queue.
	*/

	void insert(Person person);
		
	Person retrieve();
}
