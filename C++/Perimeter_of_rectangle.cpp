#include<iostream>
using namespace std;
int main(){
    int length;
    int breadth;
    cout<<"Enter Length : ";
    cin>>length;
    cout<<"Enter Breadth : ";
    cin>>breadth;
    int perimeter = 2*(length+breadth);
    cout<<"Perimeter is : "<<perimeter<<endl;
    return 0;
}