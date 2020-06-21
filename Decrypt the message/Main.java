#include<iostream>
using namespace std;

int main(){
  int a,b,sum,sum2;
  cin >>a >> b;
  sum = a+b;
  
  for(int i=sum-1;i>0;i--){
    if(sum%i == 0){
      sum2 = sum2 + i;
      }
    else
      continue;
  }
  
  if(sum == sum2)
    cout << "They can read the message";
  else 
    cout <<"They can't read the message";
}