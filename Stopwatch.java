import java.sql.Time;
import java.util.Scanner;
class Stopwatch
{
   public static void main(String args[])
   {	long startTime = System.nanoTime();
    for(int i=0;i<30000;i++){}
    
    long endTime = System.nanoTime();

    System.out.println("time duration to run this loop is "+(endTime-startTime)+"ns");
   }
}