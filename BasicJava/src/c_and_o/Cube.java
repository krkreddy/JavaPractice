package c_and_o;

public class Cube {
	int length;
	int breadth;
	int height;
	
	Cube(){	//constructor never returns any value
		System.out.println("We are in constructor");
		length=10;
		breadth=20;
		height=30;
	}

	Cube(int l, int b, int h){	//constructor never returns any value
		System.out.println("We are in intialization constructor");
		length=l;
		breadth=b;
		height=h;
	}
	
	public int add(int a, int b){
		return (a+b);
	}
	
	public double add(double a, double b){  //Method overloading
		return (a+b);
	}
	
	public String add(String a, String b){  //Method overloading
		return (a+b);
	}
	
	public int getCubeVolumne(){
		return length*breadth*height;
	}
	
}
