public class Ticket
{
public String getTicketInfo(String theaterName, String movieName, String seatNo)

{
return "Theater Name: " +theaterName + "\nMovie Name: " +movieName + "\nSeat No: " +seatNo;
}
public static void main(String [] args){
Ticket ticket=new Ticket();
String result1 = ticket.getTicketInfo("Alankar", "HIT 3", "A12");
String result2 = ticket.getTicketInfo("Alankar", "Retro", "A13");
System.out.println(result1);
System.out.println(result2);
}
}

