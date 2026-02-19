#include<iostream>
using namespace std;
int main(){
    int eng;
    int science;
    int math;
    cout<<"Enter English Mark : ";
    cin>>eng;
    cout<<"Enter science Mark : ";
    cin>>science;
    cout<<"Enter math Mark : ";
    cin>>math;

    int avg = (eng+science+math)/3;
    cout<<"Averege marks = "<<avg<<endl;


   
    return 0;
}