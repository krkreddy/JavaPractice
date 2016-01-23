package c_and_o;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Mark = new Student();//Object or Instance
		Mark.setName("Ramakrishna");
		Mark.setId(1209319770);
		Mark.setScore(99);
		
		Student Tom = new Student();//Object or Instance
		Tom.setName("Reddy");
		Tom.setId(1209319770);
		Tom.setScore(99);
		
		System.out.println(Mark.getName()+" with an id "+Mark.getId()+" and obatained a score of "+Mark.getScore());
		System.out.println(Tom.getName()+" with an id "+Tom.getId()+" and obatained a score of "+Tom.getScore()+"\n");

		Cube cube1 = new Cube();//Cube is default constructor defined by java. Its name should match class
		System.out.println(cube1.getCubeVolumne());
		
		Cube cube2 = new Cube(20,20,20);
		System.out.println(cube2.getCubeVolumne()+"\n");
		
		// Method overloading outputs
		System.out.println("Method overloading outputs:");
		System.out.println(cube1.add(10, 20));
		System.out.println(cube1.add(10.5, 20.3));
		System.out.println(cube1.add("Ramakrishna ", "Reddy"));
	}

}
