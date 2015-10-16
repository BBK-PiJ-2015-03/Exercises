Employees database = new Employees();
boolean finished = false;
int i = 0;
while (!finished) {
    for (; i < database.employeeName.length-1; i++) {
        System.out.print("Enter employee name: ");
        database.employeeName[i] = System.console().readLine();
        System.out.print("Enter employee ID: ");
        database.employeeId[i] = Integer.parseInt(System.console().readLine());
    }
}
    if (database.employeeName[i] == "" || database.employeeId[i] == 0){
    finished = true;
    } else {
    	String[] tempName = new String[i+i];
    	int[] tempId = new int[i+i];
    	for(int c=0; i<database.employeeName.length-1; c++){
  			tempName[c]=database.employeeName[c];
  			tempId[c]=database.employeeId[c];
  			for(int cc=0; i<database.employeeName.length-1; cc++){
  				database.employeeName[cc]=tempName[cc];
  				tempId[c]=database.employeeId[cc];
  			}
    	}
    }
	for (int ii = 0; ii < database.employeeId.length-1; ii++) {
    	if (database.employeeId[ii] < 1000) {
        System.out.println(database.employeeId[ii] + " " + database.employeeName[ii]);
   	 	}
	}
	for (int iii = 0; iii < database.employeeName.length-1; iii++){
    	if (database.employeeName[iii].charAt(0) == 'J' || database.employeeName[iii].charAt(0) == 'S') {
        	System.out.println(database.employeeId[iii] + " " + database.employeeName[iii]);
    	}
    }
