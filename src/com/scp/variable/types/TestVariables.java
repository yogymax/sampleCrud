/**
 * 
 */
package com.scp.variable.types;


/**
 * @author Yogesh
 *
 * One file many classes possible -- but single should be public 
 * public class name and filename should match
 * no public classs-- you can specify any classname as ur filename
 * file name extesion should be .java
 *
 *
 */
public class TestVariables {

	static{
		System.out.println("inside Tstatic block");
	}
	
	{
		System.out.println("inside Tinstance block");
		
		/**
		 * 
		 * 
		 * java to json
		 * json to java -- 
		 * 
		 * Org.json --
		 * jackson
		 * json.simple
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("inside main");
		Student st1 = new Student(1,"Abc");//id,nm
		Student st2 = new Student(2,"PQR");//id,nm
		st1.showStudentInfo();
		st2.showStudentInfo();
		Student.displayStudentInfo(st1);
		Student.displayStudentInfo(st2);
		
		
	}

}


class Student{
	
	static{
		System.out.println("inside static block");
	}
	
	{
		System.out.println("inside instance block");
	}
	
	public int studId;//I
	public String studName;//I
	
	public  static String studUniversity="Pune";//S
	
	public Student(int id, String name) {
		this.studId = id;
		this.studName = name;
	}
	

	public void showStudentInfo(){
		
		System.out.println(studId); //II
		System.out.println(studName);//II
		System.out.println(studUniversity);//IS
		
	}
	
	
	public static void displayStudentInfo(Student st){
	
		System.out.println(st.studId); //II
		System.out.println(st.studName);//II
		System.out.println(studUniversity);//IS
	
	}
	
	
}



















