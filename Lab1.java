//1.Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.
public class Ternary
{
    public static void main(String args[])
    {
       int num1 = 10;   
       int num2 = 30;
       int max=(num1>num2)?num1:num2;
       System.out.println(max);
    }
}



 //2.Write a program to to swapping two numbers without using third variable.
public class Swap
{
    public static void main(String args[])
    {
        int n=15;
        int m=9;
        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("After Swapping:\n"+"n:"+n+"\n"+"m:"+m);
    }
}
