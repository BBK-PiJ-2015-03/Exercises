
CreatingMatrices createMatrice = new CreatingMatrices();

System.out.println("Testing Constructor Method");
int[][] firstArray = createMatrice.Matrix(34, 35);
System.out.println(" ");

System.out.println(firstArray[1][2] + " " + firstArray[2][1]);
firstArray[1][2] = 0;
System.out.println(firstArray[1][2] + " " + firstArray[2][1]);
System.out.println(firstArray.length)

