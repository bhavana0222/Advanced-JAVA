//1.Write a program to check whether a number is a Strong number or not.
public class StrongNum {

	public static void main(String args[]) {
		
		// Initialize num and sum
		int num=145,sum=0;
		int temp=num; //Store the original number in temp for processing
		while(temp>0)
		{
			int fact=1;// Initialize 'fact' to 1 for calculating factorial
			int rem=temp%10;// Get the last digit of temp
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp/=10; // Remove the last digit by dividing 'temp' by 10
	    }
		// If the sum of the factorial equals to given number, it's a Strong Number
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}


//2.Write a program to print Fibonacci series by reading the range value from the console. 
public class Fibonacci {
   public static void printFibonacci(int n)
   {
        int a=0,b=1; //Initialize the first two numbers of the Fibonacci series
        for (int i=1;i<n;i++) 
        {
            System.out.print(a+" ");//Print the current Fibonacci number
            int m=a+b;//Calculate the next Fibonacci number
            a=b; //Update 'a' to the current 'b'
            b=m;//Update 'b' to the next Fibonacci number
        }
   }
	public static void main(String args[]) {
		 Fibonacci f=new Fibonacci();
	         //Call the printFibonacci method to print the series up to the specified range
		 f.printFibonacci(15);       
	}
}
