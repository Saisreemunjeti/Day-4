public class Reservation
{
public String getReservationDetails(String hotelName, String guestName, int nights)
{
return "Hotel Name: " +hotelName + "\nGuestName: " +guestName + "\nNights: " +nights;
}
public static void main(String [] args){
Reservation reservation=new Reservation();
String result1 = reservation.getReservationDetails("Taj Deccan", "Alice", 4);
String result2 = reservation.getReservationDetails("Taj Deccan", "Bob", 3);
System.out.println(result1);
System.out.println(result2);
}
}

