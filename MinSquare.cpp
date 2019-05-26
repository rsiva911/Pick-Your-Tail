#include<iostream>
#include<bits/stdc++.h>
#include<math.h>
using namespace std;
int main()
{
    int n,k;
    cin>>n;
    int x[n],y[n];
    int diff_x=INT_MAX, diff_y=INT_MAX, temp;
    for(int i=0;i<n;i++)
        cin>>x[i];
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>y[i];
    cin>>k;
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
    if(abs(diff_x)>abs(diff_y))
        cout<<"\nMin area: "<<(abs(diff_x)+2)*(abs(diff_x)+2);
    else
        cout<<"\nMin area: "<<(abs(diff_y)+2)*(abs(diff_y)+2);
}
