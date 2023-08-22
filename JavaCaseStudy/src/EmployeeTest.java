import Emp.Employee;
public class EmployeeTest {
     public static void main(String[] args) {
    	 
    	   Employee emp1 = new Employee("Nikky Singh",22,"Software Developer",95000.00f);
    	   System.out.println("The Details of Employee are :-");
    	   System.out.println("Name : "+emp1.Name);
    	   System.out.println("Age : "+emp1.Age);
    	   System.out.println("Designation : "+emp1.Designation);
    	   System.out.println("Salary : "+emp1.Salary);
    	   
     }
}
