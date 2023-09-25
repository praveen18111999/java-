package busticket;

public class Bus {
	private int Busno;
	private boolean ac;
	private  int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.Busno=no;
		this.ac=ac;
		this.capacity=cap;
		
	}
	
	public int getBusno() {
		return Busno;
	}
	public boolean isAc() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
		
	}

	public void setAc(boolean val) {
		ac=val;
		
	}
	public void setcapacity(int cap) {
	 capacity=cap;	
	}

  void displaybusinfo(){
	  System.out.println("Bus no :"+ Busno+"AC :"+ ac+"capacity"+capacity);
  }
	  
  }
