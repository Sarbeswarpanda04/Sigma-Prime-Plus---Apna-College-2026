#include<iostream>
using namespace std;
int main(){
    int a = 5;
    int b = 8;
    int c = 10;
    cout<<boolalpha;
    cout<<(a<b && a<c)<<endl;
    cout<<(a>b || a<c)<<endl;
    return 0;
}