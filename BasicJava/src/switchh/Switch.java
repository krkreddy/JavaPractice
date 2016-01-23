package switchh;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		score = 95;
		
		switch(score){
		case 95:
			System.out.println("Very Good 95");
			
			System.out.println("Rocking");
			
		case 90:
			System.out.println("Very Good 90");
			break;
			
		case 60:
			System.out.println("Good");
			break;
			
		case 40:
			System.out.println("OK");
			break;
			
		default:
			System.out.println("Grades are not defined");
			break;
			
		//System.out.println("Rocking");
			
		}

	}

}
