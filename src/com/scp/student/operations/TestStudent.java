package com.scp.student.operations;

public class TestStudent {
	
	
	/**
	 * 
	 * tostring is a callback method which is 
	 * present inside object class, default implementation 
	 * to print fullyqualified class name @ hashcode
	 * 
	 * If you want your own representation for your objects
	 * you should override it-- right click on yourclass(ctr+shift+s)
	 * source -- genereate Tostring
	 * 
	 * 
	 * 
	 *  
	 *  
	 * 
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Address pune = new Address("Pune",231057);
		Address mumbai = new Address("Mumbai",411057);
		
		
		Student st1= new Student(1, "yogesh",40,pune);
		Student st2= new Student(2, "A",80,mumbai);
		Student st3= new Student(3, "B",80,mumbai);
		Student st4= new Student(4, "C",80,pune);
		Student st5= new Student(5, "D",80,pune);
		Student st6= new Student(6, "E",80,mumbai);
		Student st7= new Student(7, "F",80,mumbai);
		
		
		//StudentServiceImpl simpl = new StudentServiceImpl();
		StudentService sservice = new StudentServiceImpl();
		sservice.addStudent(st1);
		sservice.addStudent(st2);
		sservice.addStudent(st3);
		sservice.addStudent(st4);
		sservice.addStudent(st5);
		sservice.addStudent(st6);
		sservice.addStudent(st7);
		
		System.out.println("All student objects-- "+sservice.getAllStudents());
		System.out.println("Object id with 10 --"+sservice.getStudent(10));
		System.out.println("Object id with 2 --"+sservice.getStudent(2));
		
		System.out.println("remove object with id 66-- "+sservice.deleteStudent(66));
		System.out.println("remove object with id 6-- "+sservice.deleteStudent(6));
		
		
		System.out.println("Before update --All student objects-- "+sservice.getAllStudents());//7F
		Student stx = new Student(102, "akasdsadkNewlyAdddded",90,pune);
		System.out.println("Update with id 7-- "+sservice.updateStudent(stx));
		System.out.println("After Update --All student objects-- "+sservice.getAllStudents());//7Newlyadded
	}

}
