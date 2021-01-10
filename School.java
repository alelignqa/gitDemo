
public class School{  /** public is access modifier , followed by a keyword class , finish with a class_name
			  and open bracket
			  keep an eye on the similarity of file name with class_name -> file is = class_name.java
		       */

 // now we are declaring global or instance variables - why global because they are in class level
 // our variables can be primitive or none primitve

	String fullName; // we declared a string variable called fullName
	String status;   // a variable is a container
	String subject;
	int totalGrade;
	char Grade;

	public void detail(){ // we are declaring a method -- method declaration should be started with  a lower case letter and camelcase if we concate words
						  // this method has a public specifier and return nothing - that is why we have the keyword void
						  // ofcourse as a block of code need to open the bracket {

		School obj = new School(); // here we have a reference or none primitive data type
		obj.fullName = "Daniel Abebe"; // at this point we have assigned a value to the empty variable
		obj.status = "Student";
		obj.subject = "Selenium";
		obj.totalGrade = 500;
		obj.Grade='A';

		System.out.println(obj.fullName + " who is a " + obj.status + " in PNT took a course name " + obj.subject + " and get a total score of " + obj.totalGrade + " which is " + obj.Grade);
	}// our method detail is closed at this step

	public static void main(String[] args){ // Here we have the famouse main method - for java to start execution - need a starting point

	School detail = new School();
	detail.detail();
	}
}// close the bracket