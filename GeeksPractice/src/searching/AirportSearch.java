package searching;

public class AirportSearch {

	private String name;
	private String code;
	private String country;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportSearch[] airport = new AirportSearch[8];
		for(int i=0;i<airport.length;i++){
			airport[i]=new AirportSearch();
		}
		airport[5].name="Montreal";
		airport[5].country="Canada";
		airport[5].code="YMX";
		airport[4].name="Lagos";
		airport[4].country="Nigeria";
		airport[4].code="LOS";
		airport[3].name="Essen";
		airport[3].country="Germany";
		airport[3].code="ESS";
		airport[2].name="Chicago";
		airport[2].country="USA";
		airport[2].code="ORD";
		airport[1].name="Beiging";
		airport[1].country="China";
		airport[1].code="PEK";
		airport[7].name="Sydney";
		airport[7].country="Australia";
		airport[7].code="SYD";
		airport[6].name="Quito";
		airport[6].country="Equador";
		airport[6].code="UIO";
		airport[0].name="Agra";
		airport[0].country="India";
		airport[0].code="AGR";
		
//		//Linear Search Prints
//		System.out.println(findAirport("India",airport));
//		System.out.println(findAirport("USA",airport));
		
		//Binary Search
		System.out.println("Finally the location is: "+binarySearch("Quito", airport));
	}
	
	public static String findAirport(String toFind, AirportSearch[] airport){
		int i=0;
		while(i<airport.length){
			if(airport[i].country==toFind) return airport[i].code;
			//System.out.println(airport[i].country);
			i+=1;
		}
		return "NA";	
	}
	
	public static int binarySearch(String toFind, AirportSearch[] airport){
		int low=0;
		int high=airport.length-1;
		int mid=(high+low)/2;
		int compare;
		do{
			mid = low+(high-low)/2;
			if(airport[mid].name.equals(toFind)) return mid;
			else{
				//System.out.println(mid +" "+airport[mid].name);
				compare=airport[mid].name.compareTo(toFind);
				System.out.println(mid+" "+compare);
				if(compare<0) low=mid+1;
				else high=mid-1;
			}
		}while(high>=low);
		return -1;
	}
}
