public class Order
{
public String getOrderDetails(String restaurantName, String foodItem, int quantity)
{
return "Restaurant Name: " +restaurantName + "\nFood Item: " +foodItem + "\nQuantity: " +quantity;
}
public static void main(String [] args){
Order order=new Order();
String result1 = order.getOrderDetails("IRA", "Mutton Biriyani", 3);
String result2 = order.getOrderDetails("IRA", "Paneer 65", 2);
System.out.println(result1);
System.out.println(result2);
}
}

