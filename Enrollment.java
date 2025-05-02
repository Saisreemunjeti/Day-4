public class Enrollment
{
public String getEnrollmentInfo(String platform, String course, String student)

{
return "Platform: " +platform + "\nCourse: " +course + "\nStudent: " +student;
}
public static void main(String [] args){
Enrollment enrollment=new Enrollment();
String result1 = enrollment.getEnrollmentInfo("Apna College", "Java Fullstack", "Krishna");
String result2 = enrollment.getEnrollmentInfo("Apna College", "MERN Fullstack", "Pallavi");
System.out.println(result1);
System.out.println(result2);
}
}

