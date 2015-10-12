/* TASK
Write a small program that asks for the names and IDs of all employees in a small company, and
store them in an array of integers and an array of Strings. The company has 10 employees.
Use a loop to go through both arrays and print the names and IDs of those employees whose
ID is less than 1000. Use another loop to print the names and IDs of those employees whose name
starts with “J” or “S”.
*/
public class HelloWorld{

     public static void main(String []args){
        String[] employeeName;
        int[] employeeId;
        employeeName = new String[10];
        employeeId = new int[10];
        boolean finished = false;
        while (!finished) {
            for (int i = 0; i < 9; i++) {
                System.out.print("Enter employee name: :");
                employeeName[i] = System.console().readLine();
                System.out.print("Enter employee ID: ");
                employeeId[i] = Integer.parseInt(System.console().readLine());
            }
            finished = true
        }
        for (int i = 0; i < 9; i++) {
            if (employeeId[i] < 1000) {
                System.out.print(employeeId[i] " + " employeeName[i]);
            }
        }
        for (int i = 0; i < 9; i++){
            if (employeeName[i].charAt(0) == 'J' || employeeName[i].charAt(0) == 'S') {
                System.out.print(employeeId[i] " + " employeeName[i]);
            }
        }
     }
}
