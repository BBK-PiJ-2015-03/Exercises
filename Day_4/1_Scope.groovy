//
//Look at the following code (with line numbers for clarity) and say where each of the following variables is visible:
//i, j, newSize, size.
//01 class UnitMatrix {
//02 int size;
//03
//04 void setSize(int newSize) {
//05 this.size = newSize;
//06 }
//07
//08 void print() {
//09 for (int i = 0; i < size; i++) {
//10 for (int j = 0; j < size; j++) {
//11 if (i == j) {
//12 println("1 ");
//13 } else {
//14 println("0 ");
//15 }
//16 }
//17 println ""
//18 }
//19 }
//20 }

//Line 02 - size
//Line 04 - newSize
//Line 05 - size, newSize
//Line 09 - i, size
//Line 10 - j, size
//Line 11 - i, j

