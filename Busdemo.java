package busticket;
import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo {
	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,60));
		buses.add(new Bus(3,true,55));
		
		int Useropt=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses) {
			b.displaybusinfo();
		}
		while(Useropt==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		Useropt=sc.nextInt();
		if(Useropt==1) {
		Booking booking=new Booking();
		if(booking.isAvailable(bookings,buses)) {
			bookings.add(booking);
			System.out.println("YOUR booking is confirmed");
		}
			else {
				System.out.println("Booking is full.Please try  an other date");
				
			}
		}
	

	}

}}
