#include<iostream>
#include<iomanip>

using namespace std;

int main()
{
  int num,n;
  float marks=0;
  
  while(n<3){
    cin >> num;
    
    if(num%2 != 0){
      marks++;
      n++;
    }
    
    else if(num%2 == 0 && num > 0){
      marks -= 0.5;
    }
    
    else if(num<0){
      marks -= 1;
      break;
    }    
  }
    
   cout << fixed << setprecision(1) << marks;
}