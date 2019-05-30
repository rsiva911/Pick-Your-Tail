import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class ListMax  
{ 
	static int listMax(int[][] op, int num_op, int n)
	{
	    int[] arr = new int[10];
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<num_op;i++)
	    {
	        for(int j=op[i][0]-1;j<op[i][1];j++)
	        {
	            arr[j]+=op[i][2];
	            if(max<arr[j])
	                max=arr[j];
	        }
	    }
	    return max;
	}
	
    public static void main(String[] args)  
    { 
        int n=0, o=0, opr=0;
        Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    o=s.nextInt();
	    opr=s.nextInt();
	    int[][] op = new int[o][3];
	    for(int i=0;i<o;i++)
	    {
	        //cin>>op[i][0]>>op[i][1]>>op[i][2];
	        op[i][0] = s.nextInt();
	        op[i][1] = s.nextInt();
	        op[i][2] = s.nextInt();
	    }
	System.out.println("\nMaximum element: "+listMax(op, o, n));
    } 
} 