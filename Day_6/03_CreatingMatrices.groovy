
CreatingMatrices createMatrice = new CreatingMatrices();

System.out.println("Testing Constructor Method");
int[][] firstArray = createMatrice.Matrix(4, 5);
System.out.println(" ");
System.out.println("Testing result of firstArray[0][0]");
System.out.println(firstArray[0][0]);
System.out.println("Testing setElement Method");
firstArray = createMatrice.setElement(1, 1, 5);
System.out.println("Testing result of firstArray[0][0]");
System.out.println(firstArray[0][0]);
