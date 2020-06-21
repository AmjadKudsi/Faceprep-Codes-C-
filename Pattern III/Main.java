#include<iostream>
using namespace std;

int main(){
  int num,k;
  cin >> num;
  
  for(int i=1;i<=num;i++){
    for(int j=1;j<i;j++)
      cout << i << "*";
    cout << i << endl;
 	k=i;
  }

  for(int i=k; i>=1;i--){
    for(int j=1;j<i;j++)
      cout << i << "*";
    cout << i << endl;
  }
}