#include <iostream>
using namespace std;

int main() {
    int w = 13; 
    double g = 0.165000; 

   double a = w * g; 

   cout << fixed; // 같이 사용해야한다. 

   cout.precision(6);
   cout << w << " * " << g << " = " << a;
    


    return 0;
}