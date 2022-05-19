package prime;

import java.util.Scanner;

public class primeornot {
	static boolean isPrime(int num)
	{
	boolean isPrime=true;
	
	
	for(int i=2; i<=num/2 ; i++   )      
    {
            if(num % i == 0)
            {
                isPrime=false;
                break;
            }
    }
            return isPrime;
	}
	public static void main(String[] args) {
		//int num=11;boolean isPrime = true;  
		//Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter the number:");
        //int num=scanner.nextInt();
		int count=0;
		for(int j=2;j<=100;j++)
		{	
        boolean result=isPrime(j);
        if(result)
        {
            System.out.println(j+" is Prime");
             //else
              //System.out.println(j+"is not Prime");
            count++;
        }
        }
		System.out.println(" the no. of prime no's are : " +count);
}
}
