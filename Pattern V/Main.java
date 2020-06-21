#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  
  int k=1, l=num*num+1, a=num;
  
  for(int i=1; i<=num; i++){
    
    for(int j=(i-1)*2;j>0;j--)
      cout << "-";
    
    for(int j=1; j<=a; j++)
      cout << k++ << "*";
    a-=1;
    
    for(int j=1;j<=a;j++)
      cout << l++ << "*";
    cout << l << endl;
    l-=(a*2);
    
  }
}
    