
public class School{  /** public is access modifier , followed by a keyword class , finish with a class_name
			  and open bracket 
			  keep an eye on the similarity of file name with class_name - file is = class_name.java
		       */
	
 // now we are declaring global or instance variables - why global because they are in class level 
 // our variables can be primitive or none primitve 

	String fullName; 
	String status;
	String subject;
	int totalGrade;
	char Grade;

	public void detail(){ // 
	
		School obj = new School();
		obj.fullName = "Daniel Abebe";
		obj.status = "Student";
		obj.subject = "Selenium";
		obj.totalGrade = 500;
		obj.Grade='A';
		
		System.out.println(obj.fullName + " who is a " + obj.status + " in PNT took a course name " + obj.subject + " and get a total score of " + obj.totalGrade + " which is " + obj.Grade);
	}
	
	public static void main(String[] args){
	
	School detail = new School();
	detail.detail();
	}
}