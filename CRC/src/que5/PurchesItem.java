package que5;

public class PurchesItem {
	public static void main(String[] args) {
		
		
		int[] notes= {1,3,2,1};
		int price=880;
		purchase(notes,price);
	}

	private static void purchase(int[] notes, int price) {
		 int[] N= {10,50,100,200};
	     int total=0;

	     for(int i=0;i<notes.length;i++)
	        {
	            total=total+notes[i]*N[i];
	        }
	        System.out.println(total);

	        if(total>price)
	            {
	               System.out.println("I can purchase"); 
	               
	            }
	        else{
	            System.out.println("I need more money");
	        }
	}
	


}
