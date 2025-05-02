public class Car
{
public void displayDetails(String showroomName, String 	modelName, int price){
System.out.println("Showroom Name : " +showroomName);
System.out.println("Car Model : " +modelName);
System.out.println("Car Price : " +price);
}
public static void main(String [] args){
Car car=new Car();
car.displayDetails("Tata Motors", "Mahindra XUV700", 1399000);
car.displayDetails("Tata Motors", "Mahindra Thar ROXX", 1299000);
}
}