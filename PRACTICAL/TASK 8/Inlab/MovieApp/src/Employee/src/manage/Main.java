package manage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	        
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "John", "HR", 50000));
	        employees.add(new Employee(2, "Alice", "Finance", 70000));
	        employees.add(new Employee(3, "Bob", "IT", 60000));
	        employees.add(new Employee(4, "Charlie", "HR", 55000));

	      
	        System.out.println("Sorting by Salary (Ascending):");
	        Collections.sort(employees, EmployeeComparator.salaryAscending);
	        for (Employee e : employees) {
	            System.out.println(e);
	        }

	      
	        System.out.println("\nSorting by Salary (Descending):");
	        Collections.sort(employees, EmployeeComparator.salaryDescending);
	        for (Employee e : employees) {
	            System.out.println(e);
	        }

	   
	        System.out.println("\nSorting by Name:");
	        Collections.sort(employees, EmployeeComparator.nameComparator);
	        for (Employee e : employees) {
	            System.out.println(e);
	        }

	        
	        System.out.println("\nSorting by Department:");
	        Collections.sort(employees, EmployeeComparator.departmentComparator);
	        for (Employee e : employees) {
	            System.out.println(e);
	        }
	    }
}
