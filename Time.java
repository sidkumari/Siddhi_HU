package Assignments;

public class Time {
	private int hr;
	private int min;
	private int sec;
	
	//Constructor to assign values to data members after checking the condition
	public Time(int hr, int min, int sec) {
		if(hr>=1 && hr<=23 && min>=1 && min<=59 && sec>=1 && sec<=59) {
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		else {
			System.out.println("Invalid Time");
			this.hr=1;
			this.min=min;
			this.sec=sec;
		}
		
	}
	//Method to show time
	public void setTime() {
		System.out.println("Time- "+ hr+":"+min+":"+sec);
	}
	
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time(3,8,56);
		t1.setTime();

	}

}
