#include<iostream>
using namespace std;
int main(){
    int t;
    int r;
    int p;
    cout<<"Enter Principle : ";
    cin>>p;
    cout<<"Enter rate of intrest : ";
    cin>>r;
    cout<<"Enter Time";
    cin>>t;

    int si = (p*t*r)/100;
    cout<<"Simple intrest = "<<si<<endl;
    return 0;
}