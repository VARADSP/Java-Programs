/**
 * 
 */
package DAY3;

/**
 * @author VARADSP
 *
 */
class vsp{
	vsp(){
		System.out.println("Super Invoked");
	}
}
public class StudentDriver extends vsp{
	private String name="VSP";
	private Integer rollno=36052;
	
	
	
	 StudentDriver(String name, Integer rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	 StudentDriver( Integer rollno,String name) {
			super();
			this.name = name;
			this.rollno = rollno;
		}
	 
	 StudentDriver(StudentDriver s) {
			super();
			this.name = s.name;
			this.rollno = s.rollno;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollno
	 */
	public Integer getRollno() {
		Integer rollno=1;//local one 
		//Integer rollno = 1;  //This returns local rollno declared in this function
		return this.rollno;//using this to return class rollno
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	//This is toString function, if we override this we get object properties
	public String toString()
	{
		return "This Object has Rollno = " + rollno + " Name = " + name;
	}
	

}
