import java.util.Scanner;
class Coupon
{
   public static void main(String args[])
   {	int num,temp=0,count=0;	
      
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter 4 digit coupon number");
    num=sc.nextInt();

    while(temp!=num)
    {
        temp =(int) ((Math.random() * (9999 - 1)) + 1);
        count++;
    }

    System.out.println("number of attempte "+count);
}
}
