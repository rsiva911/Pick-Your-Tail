#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int listMax(int op[][3], int num_op, int n)
{
    int arr[n]={0};
    int max=INT_MIN;
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
int main()
{
    int n, o, opr;
    cin>>n>>o>>opr;
    int op[o][3];
    for(int i=0;i<o;i++)
    {
        cin>>op[i][0]>>op[i][1]>>op[i][2];
    }
    cout<<"\nMaximum element: "<<listMax(op, o, n);
}
