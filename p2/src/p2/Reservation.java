package p2;

public class Reservation {
	
	String Personname;
	int seatnumber;
	String Destinationplace;
	public void ShowDetails(){
		Personname="Melinda";
		seatnumber=23;
		Destinationplace="Mumbai";
		System.out.println("Person name is "+Personname);
		System.out.println("Seat number is "+seatnumber);
		System.out.println("Destination place is "+Destinationplace);
	}

	public static void main(String[] args) {
		Reservation r1=new Reservation();
		r1.ShowDetails();

	}

}
