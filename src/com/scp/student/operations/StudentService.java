package com.scp.student.operations;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * To define a contract
 * 
 * @author Yogesh
 *
 */
public interface StudentService {
	
	public int addStudent(Student st);
	public boolean deleteStudent(int id);
	public boolean updateStudent(Student st);
	public Student getStudent(int studId);
	public List<Student> getAllStudents();
	

}



class StudentServiceImpl implements StudentService{

	List<Student> listOfStudent = new ArrayList<>();
	
	@Override
	public int addStudent(Student st) {
		listOfStudent.add(st);
		return st.getStudId();
	}

	
	
	@Override
	public boolean deleteStudent(int id) {
		boolean flag=false;
		for(int i=0;i<listOfStudent.size();i++) {
			
			Student item = listOfStudent.get(i);
				if(item.getStudId()==id){
					listOfStudent.remove(i);
					flag=true;
				}
				
				
		}
		return flag;
	}

	
	
	
	
	@Override
	
	public boolean updateStudent(Student st) {
		boolean flag =false;
		for(int i=0;i<listOfStudent.size();i++) {
			Student item = listOfStudent.get(i);
				if(item.getStudId()==st.getStudId()){
					flag=true;
				}
		}
		
		if(!flag){
			addStudent(st);
			return flag;
		}
		
		for(int i=0;i<listOfStudent.size();i++) {
			Student item = listOfStudent.get(i);
				if(item.getStudId()==st.getStudId()){
					item.setStudName(st.getStudName());
					item.setStudAddress(st.getStudAddress());
					item.setMarks(st.getMarks());
					break;
				}
		}
		
		
		return flag;
	}

	@Override
	public Student getStudent(int studId) {
		Student st = null;
		for(int i=0;i<listOfStudent.size();i++) {
			Student item = listOfStudent.get(i);
				if(item.getStudId()==studId){
					st=listOfStudent.get(i);
					break;
				}
				
				
		}
		
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		return listOfStudent;
	}
	
}


