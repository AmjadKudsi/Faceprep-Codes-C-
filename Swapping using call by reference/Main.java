#include<iostream>
using namespace std;

int swap(int &a, int &b){
  int c;
  c = a;
  a = b;
  b = c;
} 
  
int main(){
  int num1, num2;
  cin >> num1 >> num2;
  
  cout << "Before swapping a= " << num1 << " and b=" << num2 << endl;
  
  swap(num1,num2);
  
  cout << "After swapping a= " << num1 << " and b=" << num2 << endl;
  
}
  