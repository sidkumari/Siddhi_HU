package Assignments;
class area{
	
	//here i have done with method overloading with different parameter list and different data types of parameter
	void areaof(double radius) {//finds area of circle
		double areaCir=3.14*radius*radius;
		System.out.println("The area of circle is "+ areaCir+" sq.units");
	}
	void areaof(int side) { // finds area of square
		int areaSq=(side*side);
		System.out.println("The area of Square is "+ areaSq+" sq.units");
		
	}
	void areaof(double l,double h) { // finds area of triangle
		double areaTri=1/2*l*h;
		System.out.println("The area of Triangle is "+ areaTri +" sq.units");
	}
	void areaof(int l,int b) { // finds area of rectangle
		int arearec=2*(l+b);
		System.out.println("The area of Square is "+ arearec+" sq.units");
	}
}

public class Q3 {
	
	//main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj=new area();
		obj.areaof(5.0); //passing radius of circle as parameter
		obj.areaof(6);  //passing sides length of square as parameter
		obj.areaof(2.7,8.9); //passing length and height of triangle
		obj.areaof(3,8); //passing length and width of rectangle
		

	}



}
