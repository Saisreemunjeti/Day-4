public class Mobile
{
public void showDetails(String storeName, String brand, int price)
{
System.out.println("Store Name : " +storeName);
System.out.println("Brand : " +brand);
System.out.println("Price : " +price);
}
public static void main(String [] args){
Mobile mobile=new Mobile();
mobile.showDetails("Pai", "Vivo Y22", 139900);
mobile.showDetails("Pai", "Samsung S20", 129900);
}
}