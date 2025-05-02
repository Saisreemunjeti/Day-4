public class Travel
{
public String getBookingDetails(String agency, String destination, int travellers)
{
return "Agency: " +agency + "\nDestination: " +destination + "\nTravellers: " +travellers;
}
public static void main(String [] args){
Travel travel=new Travel();
String result1 = travel.getBookingDetails("SLN Travels", "Arunachalam", 5);
String result2 = travel.getBookingDetails("SLN Travels", "Srikakulam", 2);
System.out.println(result1);
System.out.println(result2);
}
}

