#include <iostream>
using namespace std;

int main() {
    int a = 5; 
    int b = 30;  
    int c = a +b; 
    int d =c; 
     c /= 8; 

    cout << c; 
    cout << "\n";

   
    d %= 8;
    cout << d; 

    return 0;
}