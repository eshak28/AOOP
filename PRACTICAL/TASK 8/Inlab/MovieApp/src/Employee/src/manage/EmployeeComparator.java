package manage;

import java.util.Comparator;
public class EmployeeComparator {
	public static Comparator<Employee> salaryAscending = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

    public static Comparator<Employee> salaryDescending = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e2.getSalary(), e1.getSalary());
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static Comparator<Employee> departmentComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getDepartment().compareTo(e2.getDepartment());
        }
    };
}
