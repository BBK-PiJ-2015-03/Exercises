/* TASK
 Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers as parameters.
 The method should copy the elements of the first array (you can call it src, from "source") to the second
 one (dst, from "destination") as much as possible.
 If the second array is smaller, then only those elements that fit will be copied. If the second array is larger, it
 will be filled with zeroes.
 Write a program that creates an object of this class and uses this method to copy some arrays in all three cases:
 - Both arrays are of the same size.
 - The source array is longer.
 - The source array is shorter.
 */
public class CopyingArrays{
    
    public static void main(String []args){
        class ArrayCopier{
            int aArray[] = {1, 2, 3, 4, 5, 6};
            int bArray[] = {3, 2, 1};
            int cArray[] = {6, 5, 4, 3, 2, 1};
            void copy(ArrayCopier src[], ArrayCopier dst[]){
                if (src.length() == dst.length()){
                    for (int i = 0; i < src.length(); i++){
                        dst[i] = src[i];
                    }
                    return;
                }
            }
        }
        ArrayCopier array = new ArrayCopier();
        
    }
}
