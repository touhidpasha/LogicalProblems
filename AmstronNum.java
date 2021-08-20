import java.util.Scanner;

public class AmstronNum{
    public static void main(String[] args) {
        int arm;
        Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
    arm=sc.nextInt();
	if(armstrongOrNot(arm)==arm)
    System.out.println("this is armstron");
    else
    System.out.println("not a armstron");
	}
static int armstrongOrNot(int num)
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
}