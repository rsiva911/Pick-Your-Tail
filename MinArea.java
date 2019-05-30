import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class MinSquare  
{ 
    public static void main(String[] args)  
    { 
    int n=0,k=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int[] x = new int[n], y = new int[n];
    int diff_x=Integer.MIN_VALUE, diff_y=Integer.MAX_VALUE, temp;
    for(int i=0;i<n;i++)
        x[i]=s.nextInt();
    n=s.nextInt();
    for(int i=0;i<n;i++)
        y[i]=s.nextInt();
    k=s.nextInt();
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            if(x[i]>x[j])
            {
                temp=x[i];
                x[i]=x[j];
                x[j]=temp;
            }
            if(y[i]>y[j])
            {
                temp=y[i];
                y[i]=y[j];
                y[j]=temp;
            }
        }
    diff_x=x[0]-x[n-1];
    diff_y=y[0]-x[n-1];
    //cout<<x[n-1]<<" "<<x[0];
    if(Math.abs(diff_x)>Math.abs(diff_y))
        System.out.println("\nMin area: "+(Math.abs(diff_x)+2)*(Math.abs(diff_x)+2));
    else
		System.out.println("\nMin area: "+(Math.abs(diff_y)+2)*(Math.abs(diff_y)+2));
    } 
} 