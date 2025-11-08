package language.basics;

public class DataTypes {

	public static void main(String[] args) {

		// 1. Temperature of a city in degrees Celsius: 25.5
		
		Float degrees = 25.5f;
		System.out.println(degrees);
		
		// 2. Whether a customer has placed an order: true or false
 
		boolean CustomerPlacedOrder1 = true;
		boolean CustomerPlacedOrder2 = false;
		System.out.println("Order1 -->" +  CustomerPlacedOrder1);
		System.out.println("Order2  -->" +  CustomerPlacedOrder2);
		
//		3. Person's phone number: "123-456-7890"
		
		long Ph = 1234567890;
		System.out.println("Phone numeber is " + Ph);
		
		String Phone = "123-456-7890";
		System.out.println(Phone);
		
		
//		4. Amount of money in a customer's bank account: 1000.50
		
		Float BankBalance = 25.5f;
		System.out.println("Customer Bank Balance is " + BankBalance);
				
//		5. Person's email address: "john.doe@example.com"
		
		String email =  "john.doe@example.com";
		System.out.println(email);
		
//		6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		Double lat,lan;
		lat =37.7749;
		lan=-122.4194;
		 System.out.println(lat+"    "+lan);
		
		//Float (lat,Long)=37.7749 , -122.4194;
		Float lng =-122.4194f;
		Float lati =37.7749f;
		System.out.println(lng);
		System.out.println(lati);
		
		
		
//		7. Person's marital status: true or false
		
		boolean MS = true;
		System.out.println(MS);
		
//      8. Person's occupation: "Software Engineer"
		
		String PO = "Software Engineer";
		System.out.println(PO);
		
//      9. Person's favourite colour: "Blue"
		
		String FavClr = "Blue";
		System.out.println(FavClr);
		
//      10.Current year: 2023
		
		int Cyear = 2023;
		System.out.println(Cyear);
				
//      11.Number of followers on a social media platform: 1,000,000
		
		int Followers = 1000000;
		System.out.println(Followers);
		
//		12.Rating of a movie: 7.5
		
		float Movie = 7.5f;
		System.out.println(Movie);
		
//		13.Person's blood type: 'A'
		
		char Blood ='A';
		System.out.println(Blood);
		
//		14.Title of a book: "To Kill a Mockingbird"
		
		String Title = "To Kill a Mockingbird";
		System.out.println("Title of the book is " + Title);
		
//		15.Number of employees in a company: 500
		
		byte Emp = 50;
		System.out.println(Emp);
		
		int EMpe = 500;
		System.out.println(EMpe);
		
//		16.Time of an event: 2:30 PM
		
		String time = "2:30 PM";
		System.out.println(time);
		
//		17.Name of a country: "United States"
		
		String C = "United States";
		System.out.println(C);
		
//		18.Person's eye color: "Brown"
		
		String Eye = "Brown";
		System.out.println(Eye);
		
//		19.Person's birthplace: "New York City"
		
		String BP = "New York City";
		System.out.println(BP);
		
//		20.Distance between two cities: 200.5
		float Dis = 200.5f;
		System.out.println(Dis);
	}

}
