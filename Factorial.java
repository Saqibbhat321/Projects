import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] elements = new int[n];
        System.out.println("enter the elements");
        for(int i =1;i<n;i++)
        {

            elements[i]=sc.nextInt();
        }
        
        sc.close();
        
        int secondlargestnumber = findsecond(elements);
        if(secondlargestnumber == Integer.MIN_VALUE)
            System.out.println("THERE is no second largerst number");
        else   
            System.out.println("The second largest number is :"+secondlargestnumber);
        
    
    }
        
        public static int findsecond(int[] elements)
        {

            int largerst = Integer.MIN_VALUE;
            int secondlargestnumber = Integer.MIN_VALUE;
            
            for(int num : elements)
            {
                if(num>largerst)
                {
                    secondlargestnumber= largerst;
                    largerst = num;
                }
                else if (num>secondlargestnumber && num != largerst)
                {
                    secondlargestnumber = num;
                }
            }
        return secondlargestnumber;
            
}
}