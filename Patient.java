public class Patient
{
public void printDetails(String hospitalName, String patientName, int age)
{
System.out.println("Hospital Name : " +hospitalName);
System.out.println("Patient Name : " +patientName);
System.out.println("Age : " +age);
}
public static void main(String [] args){
Patient patient=new Patient();
patient.printDetails("Yashoda", "Suma", 34);
patient.printDetails("Yashoda", "Swathi", 22);
}
}