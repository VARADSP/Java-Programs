package DAY3;

public class Access_working {
	private Integer rollno;
	//always use Non primitive data type
	private String name;
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		String VSP;
	
		StudentDriver student1 = new StudentDriver(123,"JAVA");
		StudentDriver student2 = new StudentDriver(123,"JAVA");
		StudentDriver student3 = new StudentDriver(student2);
		
		student1.setName("VSP1");
		if(student1.getName().getClass().equals(String.class))//Method for checking if this equals the String
		    System.out.println(student1.getName());
		else
			System.out.println("Cheated");
		
		if(student1.getRollno().getClass().equals(Integer.class))//Method for checking if this equals the Integer
		    System.out.println(student1.getRollno());
		else
			System.out.println("Cheated");
		
		
		System.out.println(student1);//Here toString will be called implicitly
		Thread.sleep(1000);
		
		System.out.println(student2);//Here toString will be called implicitly
		
		System.out.println(student3);
		
		
	}





	private static String typeof(String vSP) {
		// TODO Auto-generated method stub
		return vSP;
	}
	

}
