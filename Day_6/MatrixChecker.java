/* TASK
Make a class MatrixChecker with three methods:
• isSymmetrical(int[]) takes an array of int and returns true if the array is symmetrical and false otherwise.
An array is symetrical if the element at [0] is the same as the element at [length-1], the element at [1] is the
same as the element at [length-2], etc.
• isSymmetrical(int[][]) takes an bidimensional array of int and returns true if the matrix is symmetrical
and false otherwise. An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.
• isTriangular(int[][]) takes an bidimensional array of int and returns true if the matrix is triangular1
and false otherwise. An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
Add some methods to your Matrix class from the other exercise to perform tests on the matrices you create
using the methods from MatrixChecker. (Hint: these methods will need to create objects of type MatrixChecker).
*/
public class MatrixChecker{

    public boolean isSymmetrical(int[] array){
        int d = 1;
        for (int i = 0; i < array.length-1; i++) {
            int c = array.length-d;
            d += 1;
            if (array[i] != array[c]){
                return false;
            }
        }
        return true;       
    }

    public boolean isSymmetrical(int[][] array) {
        int d = 1;
        for (int i = 0; i < array.length-1; i++) {
            int first = array.length-d;
            d += 1;
            int e = 1;
            for (int ii = 0; ii < array[0].length-1; ii++) {
                int second = array[0].length-e;
                e += 1;
                if (i > ii){
                    if (array[first][second] != array[second][first]) {
                        return false;
                    }
                }
            }
        }
         return true;
    }

    //public boolean isTriangular(int[][] array) {
    // this will check if the array is triangular
    //}
 
}
