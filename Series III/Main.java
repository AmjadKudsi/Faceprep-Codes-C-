#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  
  int n = 6;
  cout << 6 <<" ";
  for(int i=1;i<num;i++){
    int mul = 5*i;
    n += mul;
    cout << n << " ";
  }
}