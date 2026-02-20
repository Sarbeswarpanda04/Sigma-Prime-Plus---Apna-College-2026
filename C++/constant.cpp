#include<iostream>
using namespace std;
int main(){
    const int num = 25;
    #define x 25;
    cout<<"\n"<<num;
    int num2 = 55;
    cout<<"\n"<<num2;
    cout<<"\n"<<x;
    return 0;
}