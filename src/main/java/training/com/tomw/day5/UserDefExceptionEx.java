package training.com.tomw.day5;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class UserDefExceptionEx {

	public static void main(String[] args) throws UserPrincipalNotFoundException, NullPointerException {
		EmployeeService es = new EmployeeService();
		es.getEmpDetails(101);
		es = null; 
		es = new EmployeeService();
		
		
		
	}

}

class EmployeeService {

	Employee e1 = new Employee("Emp1", 101);
	Employee e2 = new Employee("Emp2", 102);

	Employee empArr[] = { e1, e2 };

	public void getEmpDetails(int empId) throws UserPrincipalNotFoundException, NullPointerException {
		if (empId == 101 || empId == 101) {
			if (empId == 101) {
				System.out.println(empArr[0]);
			}
		} else {
			throw new UserPrincipalNotFoundException("User not found for the given value");
		}
	}
}
