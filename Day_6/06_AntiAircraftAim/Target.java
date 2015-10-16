public class Target {
    public int[][][] Target(int x){ 
        int[][][] newArray = new int[x][x][1];
        return newArray;
    }
    public int init(){

    	int numberToGuess = (int) Math.abs(1 * Math.random());
    	return numberToGuess;

    }
}