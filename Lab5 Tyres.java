//Create a class Tyres with methods avgLifeTime(),Define classes Mrf and Ceat which implement Tyres and override the method
public interface Tyres {
	void avgLifeTime();
	 String manufacture_date(String date);
 }
 //Define a class called Mrf that implements the Tyres interface
 class Mrf  implements Tyres{
     int price;
     String brand;
    // Define getter and setter methods for price and brand
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	// Implement the avgLifeTime() method
    public  void avgLifeTime() {
    	System.out.println("Avg Life time of MRF=5Year");
    }
    // Implement the manufacture_date() method
	public String manufacture_date(String date) {
				return date;
	}	
}
public class TyresDemo {
   public static void main(String[] args) {
	   Mrf1 mrf1=new Mrf1();
	   // Set the brand and price of the Mrf instance
	   mrf1.setBrand("MRF");
	   mrf1.setPrice(2000);
	   mrf1.avgLifeTime();
	   mrf1.manufacture_date("2025-01-02");
	   // Print the brand, price, and manufacture date of the Mrf instance
	   System.out.println("Brand:"+mrf1.getBrand()+"\nPrice:"+mrf1.getPrice()+"\nMFD:"+mrf1.manufacture_date("2025-01-02"));
	   // Call the avgLifeTime() method on the Tyres instance
	   Tyres tyre=new Mrf1();
	   tyre.avgLifeTime();
   }
}