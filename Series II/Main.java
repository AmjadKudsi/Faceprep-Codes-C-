#include<iostream>
using namespace std;

int main(){
  int num;
  cin >> num;
  int n = 7;
  for(int i=1; i<=num; i++){
	
    cout << (n+4)*(n+4) <<" ";
    n += 4;
    
  }
}