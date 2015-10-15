MatrixChecker check = new MatrixChecker();

//Creating symmetrical array
int[] firstArray = new int[5];
firstArray[0] = 1;
firstArray[1] = 2;
firstArray[2] = 1;
firstArray[3] = 2;
firstArray[4] = 2;

//Checks if array is symmetrical
System.out.println(check.isSymmetrical(firstArray));

//Creating symmetrical 2d array
int[][] secondArray = new int[2][2];
secondArray[0][0] = 1;
secondArray[0][1] = 2;
secondArray[1][0] = 1;
secondArray[1][1] = 2;

//Checks if 2d array is symmetrical
System.out.println(check.isSymmetrical(secondArray));
 
//Creating triangular array
int[][] thirdArray = new int[3][3];
thirdArray[0][0] = 1;
thirdArray[1][0] = 2;
thirdArray[1][1] = 3;
thirdArray[2][0] = 4;
thirdArray[2][1] = 5;
thirdArray[2][2] = 6;
System.out.println(Arrays.deepToString(thirdArray));
