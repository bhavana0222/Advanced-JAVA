//1.Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg.
public class HillStations {
	// Method to print the location of HillStations
	void location()
	{
		System.out.println("Location:Himalayas");
	}
	// Method to print what HillStations are famous for
	void famousFor()
	{
		System.out.println("Famous for enjoyment and stunning natural beauty");
	}
	public static class Manali extends HillStations
	{
		// Override the location method to print the location of Manali
        void location() {
			System.out.println("Location:Himachal Pradesh");
        }
        // Override the famousFor method to print what Manali is famous for
		void famousFor() {
			System.out.println("Famous for cultural significance");
		}	
	}
	public static class Mussoorie extends HillStations
	{
		void location() {
			System.out.println("Location:Dehradun");
		}
		void famousFor() {
			System.out.println("Famous for scenic beauty");
		}
	}
	public static class Gulmarg extends HillStations
	{
		void location() {
			System.out.println("Location:Jammu and Kashmir");
		}
		void famousFor()
		{
			System.out.println("Famous for Skiing and Golfing");
		}
	}
    public static void main(String args[])
    {
    	// Create instances of the subclasses
    	HillStations hs=new HillStations();
    	hs.location();
    	hs.famousFor();
    	
    	// Create instances of the Manali, Mussoorie, and Gulmarg classes
    	Manali manali=new Manali();
    	System.out.println("\nManali:");
    	manali.location();
    	manali.famousFor();
    	
    	Mussoorie mu=new Mussoorie();
    	System.out.println("\nMussoorie:");
    	mu.location();
    	mu.famousFor();
    	
    	Gulmarg g=new Gulmarg();
    	System.out.println("\nGulmarg:");
    	g.location();
    	g.famousFor();
    }
}


//2.Overload add method with different set/type of parameters to perform addition of given numbers.
public class Calculate {
    //method to add two integers
	void add(int num1,int num2)
	{
		System.out.println("Addition="+(num1+num2));
	}
	//method to add three integers
	void add(int num1,int num2,int num3)
	{
		System.out.println("Addition="+(num1+num2+num3));
	}
	//method to add two floating-point numbers
	void add(double num1,double num2)
	{
		System.out.println("Addition="+(num1+num2));
	}
	public static void main(String[] args) {
		
		//create an instance of calculate class
		Calculate c=new Calculate();
		c.add(20,17);
		c.add(6, 8, 19);
		c.add(10.5, 20.7);
	}
}

