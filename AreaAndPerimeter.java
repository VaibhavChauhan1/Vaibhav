package area_and_parameter;

public class AreaAndPerimeter {
	
	public void areaandperimeter(int length,int breadth) {
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("Area of Rectangle : "+area);
		System.out.println("Perimeter of Square : "+perimeter);
	}
	
	public void areaandperimeter(int side) {
		int area=side*side;
		int perimeter=4*side;
		System.out.println("Area of Square : "+area);
		System.out.println("Perimeter of Square : "+perimeter);
	}
	
	public void areaandperimeter(double radius) {
		double area=3.142*radius*radius;
		double circum=3.14*2*radius;
		System.out.println("Area of Circle : "+area);
		System.out.println("circumference of Circle : "+circum);
	}
	

}
