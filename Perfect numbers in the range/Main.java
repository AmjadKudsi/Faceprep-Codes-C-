#include<iostream>
using namespace std;

int main(){
  int start, end, sum;
  cin >> start >> end;
  
  for(int i=start;i<=end;i++){
    sum=0;
    for(int j=i-1;j>0;j--){
      if(i%j==0){
        sum = sum + j;
      }
    }
    if(sum == i)
  		cout << i <<" ";       
  } 
}