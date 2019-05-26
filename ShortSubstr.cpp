#include<iostream>
#include<map>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
map<char, int> setZero(map<char, int> a, char *inp)
{
    for(int i=0;i<strlen(inp);i++)
    {
        a[inp[i]]=0;
    }
    return a;
}
int AllCharFound(map<char, int> a)
{
    map<char, int>::iterator itr;
    int flag=1;
    for(itr = a.begin();itr!=a.end();itr++)
    {
        if(itr->second<1)
        {
            flag=0;
            break;
        }

    }
    if(flag==1)
        return 1;
    else return 0;
}
int main()
{
    map<char, int>alpha;
    int count=1, flag=0, prev_count=INT_MAX;
    char inp[50];
    cin>>inp;
    setZero(alpha, inp);
    for(int i=0;i<strlen(inp);i++)
    {
        alpha=setZero(alpha, inp);
        count=1;
        for(int j=i;j<strlen(inp);j++)
        {
            alpha[inp[j]]++;
            if(AllCharFound(alpha))
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
    cout<<"\nShortest substring length: "<<prev_count;
}
