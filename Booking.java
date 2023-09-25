package busticket;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
           String Passenger_name;
           int Busno;
           Date date;
           
      Booking(){
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter a passenger name");
    	  Passenger_name=sc.nextLine();
    	  System.out.println("Enter bus no: ");
    	  Busno=sc.nextInt();
    	  System.out.println("Enter the date dd-mm-yyyy");
    	  String dateInput=sc.next();
    	  SimpleDateFormat  dateFormat=new SimpleDateFormat("dd-MM-yyyy");
    	  try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
    	  int capacity=0;
    	  for(Bus bus:buses) {
    		  if(bus.getBusno()==Busno)
    			  capacity=bus.getcapacity();
    		  
    	  }int booked=0;
		for(Booking b:bookings) {
			if(b.Busno==Busno && b.date.equals(date)){
			  booked++;
		}
      }
		return booked<capacity?true:false;
		
}
}