#include<iostream>
using namespace std;
int main(){
    float pencil=10.5 , pen=5.2 , eraser=2.2;
    
    float total_cost = pencil+pen+eraser;
    float total_cost_after_tax = total_cost+(total_cost*(18/100));
    cout<<"Total bill amount : "<<total_cost_after_tax<<endl;
    return 0;
}