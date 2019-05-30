import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class shortSubtr{
static Map<Character, Integer> setZero(Map<Character, Integer> a, String inp)
{
    for(int i=0;i<inp.length();i++)
    {
        //a[inp[i]]=0;
        a.put(inp.charAt(i), 0);
    }
    return a;
}
static int AllCharFound(Map<Character, Integer> a)
{
    Set<Map.Entry<Character,Integer>> st = a.entrySet();
    int flag=1;
    for(Map.Entry<Character,Integer> itr:st)
    {
        if(itr.getValue()<1)
        {
            flag=0;
            break;
        }

    }
    if(flag==1)
        return 1;
    else return 0;
}
public static void main(String[] args)
{
    Map<Character, Integer>alpha = new HashMap<Character, Integer>();
	Scanner s=new Scanner(System.in);
    int count=1, flag=0, prev_count=Integer.MAX_VALUE;
    //char[] inp = new char[50];
    String inp=s.nextLine();
    setZero(alpha, inp);
    for(int i=0;i<inp.length();i++)
    {
        alpha=setZero(alpha, inp);
        count=1;
        for(int j=i;j<inp.length();j++)
        {
            //alpha[inp[j]]++;
            alpha.put(inp.charAt(j), alpha.get(inp.charAt(j))+1);
            if(AllCharFound(alpha)==1)
            {
                if(prev_count>count)
                    prev_count=count;
                break;
            }
            else
            { 
                count++;
            }
        }
    }
    System.out.println("\nShortest substring length: "+prev_count);
}
}