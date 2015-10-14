ArrayCopier aC = new ArrayCopier();

int[] aArray = new int[2];
aArray[0] = 1;
aArray[1] = 2;
int[] bArray = new int[2];
bArray[0] = 3;
bArray[1] = 4;

System.out.println(bArray[0]);
aC.copy(aArray, bArray);
System.out.println(bArray[0]);


