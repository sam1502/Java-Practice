/*You are given a list of student information: ID, FirstName, and CGPA.
 * Your task is to rearrange them according to their CGPA in decreasing order.
 * If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
 * If those two students also have the same first name, then order them according to their ID. 
 * No two students have the same ID.*/



package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Student{
	private int id;
	private String fname;
	private double cgpa;
	
	public Student(int id, String fname, double cgpa){
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
	
}

class Sorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getCgpa() == o2.getCgpa()){
			if(o1.getFname().equals(o2.getFname()))
				return ((o1.getId() < o2.getId()) ? 1:-1);
			else
				return (o1.getFname().compareTo(o2.getFname()));
		}
		else
			return ((o1.getCgpa() < o2.getCgpa()) ? 1:-1);
	}
	
}


public class JavaSortHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<Student> stu = new ArrayList<>();
		int testCases = in.nextInt();
		
		for(int i=0;i<testCases;i++){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			stu.add(st);
		}
		
		Sorter sorter = new Sorter();
		Collections.sort(stu, sorter);
		for(Student st : stu){
			System.out.println(st.getFname());
		}

	}

}
