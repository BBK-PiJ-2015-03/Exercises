
CreatingMatrices createMatrice = new CreatingMatrices();

System.out.println("Testing Constructor Method");
int[][] firstArray = createMatrice.Matrix(4, 5);
//Point 1

//Check size of array
System.out.println("Array Size = " + firstArray.length + " " + firstArray[0].length);


System.out.println(" ");
System.out.println("Testing result of firstArray[0][0]");
System.out.println(firstArray[0][0]);
System.out.println("Testing setElement Method");

//This seems to expant the array size - strange?
firstArray = createMatrice.setElement(10, 5, 10);

//Point 1

System.out.println("Testing result of firstArray[10][5]");

//Print the element at position [10][5]
System.out.println(firstArray[10][5]);

//Checking size of array - this should always remain the same?
System.out.println("Array Size = " + firstArray.length + " " + firstArray[0].length);

//Why does this work? it does not give an IndexOutOfBoundsException error
//If I try to print the new element in position [10][5] at Point 1
//I will then get an IndexOutOfBoundsException error