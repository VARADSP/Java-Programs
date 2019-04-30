package workshopday4;

public class Employee {
	double empid;
	static int i=0;
	String empfirstname;
	String emplastname;
	String empdesgn;
	String empdept;
	//Do not Give _ in Variable name

	public double getEmpid() {
		return empid;
	}


	public void setEmpid(double empid) {
		this.empid = empid;
	}


	public String getEmpfirstname() {
		return empfirstname;
	}


	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}


	public String getEmplastname() {
		return emplastname;
	}


	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}


	public String getEmpdesgn() {
		return empdesgn;
	}


	public void setEmpdesgn(String empdesgn) {
		this.empdesgn = empdesgn;
	}


	public String getEmpdept() {
		return empdept;
	}


	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}


}




class EmployeeUtils
{
	
	Employee[] employees = new Employee[100];
	
	public void addEmployee()
	{
		Employee employees[i] = new Employee();
		
		
	}
	public void getEmpDetails()
	{
		System.out.println(e1);
	}
}