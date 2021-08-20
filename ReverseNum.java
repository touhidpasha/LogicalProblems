import java.util.Scanner;
class ReverseNum
{
   public static void main(String args[])
   {		
       int num,temp=0,i;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       
       while(num!=0)
       {
           i=num%10;
           temp=temp*10+i;
           num=num/10;
       }
       
       System.out.println("reverse num is"+temp);
   }
}