import com.yugesh.assignment.employees.*;
import com.yugesh.assignment.utilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		Manager m = new Manager("Bokka",1,80000,"Banking");
		Devoloper d= new Devoloper("Gajala",420,50000,"Java");
		EmployeeUtilities u=new EmployeeUtilities();
		u.printEmployee(m);
		u.printEmployee(d);
	}

}
