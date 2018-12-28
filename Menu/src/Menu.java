import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner ;
public class Menu {
	
	
		public void menu() {
		
			System.out.print("Entre with day time morning or night and set you Dish :");

			String input = System.console().readLine();
			String order[] = input.split(",");		

			switch (order[0].trim()) {	
				case "morning" :
					this.incrementCaseMorning(order); 
					break;
				case "night" :
					this.incrementCaseNight(order);
					
					break;
				default:
					System.out.println("Order Denied");
					break;			
			}
			
		}		

		public void incrementCaseMorning(String[] orders) {
			ArrayList<String> List = new ArrayList<String>();
			for(int i =1; i < orders.length ;i++){
				switch (orders[i]) {	
					case "1" :
						List.add("Eggs");				
						break;
					case "2" :						
						List.add("Toast");
						break;
					case "3" :
						List.add("Coffee");
						break;	
					case "4" :
						List.add("erro");
						break;
					default:
						break;				
				}	
			}
			System.out.println(Arrays.toString(List.toArray()));
		}		
		
		public void incrementCaseNight(String[] orders) {
			ArrayList<String> List = new ArrayList<String>();
			for(int i = 1; i < orders.length; i++ ) {
				switch (orders[i]) {
				
				case "1" :
					List.add("Steak");
					break;
				case "2" :
					List.add("Potato");
					break;
				case "3": 
					List.add("Wine");
					break;
				case"4":
					List.add("Cake");
					break;
				default:
					break;

			}
		}
			System.out.println(Arrays.toString(List.toArray()));
		
	}	
}
		
		

	
			
		
			
	

		
	
		



