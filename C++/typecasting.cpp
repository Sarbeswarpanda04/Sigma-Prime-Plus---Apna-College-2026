#include<iostream>
using namespace std;
int main(){
    int a = 25;
    int b = a;
    int pi = 3.14;
    cout<<"\n"<<a;
    cout<<"\n"<<b;
    cout<<"\n"<<pi;
    cout<<"\n"<<('A'+5);

    cout<<"\n"<<(int)'A';
    cout<<"\n"<<(char)'A'+1;
    cout<<"\n"<<(bool)3+2;
    cout<<"\n"<<(23.5+2+'A');
    cout<<"\n"<<(int)(23.5+2+'A');
    cout<<"\n"<<(char)(int)(23.5+2+'A');
    return 0;
}