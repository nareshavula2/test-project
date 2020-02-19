package com.nubes.cj.basics;
 
public class questionsdemo {
	public static void main(String[] args) {
		String q = "NCET=123,abc,23-MIT=1234,xyz,21";
		String college[] = q.split("-");
		String Student1 = college[0];
		System.out.println(Student1);
		String Student2 = college[1];
		System.out.println(Student2);
		
		String CollegeName = Student1.split("=")[0];
		System.out.println(CollegeName);
		String CollegeName1 = Student2.split("=")[0];
		System.out.println(CollegeName1);
		String StudentInfo[] = Student1.split("=")[1].split(",");
		System.out.println("USN: "+StudentInfo[0]);
		
		
		
	}

}
