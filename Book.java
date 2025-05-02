public class Book
{
public void displayInfo(String libraryName, String title, String author){
System.out.println("Library Name : " +libraryName);
System.out.println("Title : " +title);
System.out.println("Author : " +author);
}
public static void main(String [] args){
Book book=new Book();
book.displayInfo("AKM Study Hall", "The Odyssey", "Homer");
book.displayInfo("AKM Stidy Hall", "To Kill a Mockingbird", "Harper Lee");
}
}