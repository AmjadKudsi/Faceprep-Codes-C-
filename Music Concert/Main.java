#include<iostream>
using namespace std;

int main(){
  int num, m=0, f=0;
  cin >> num;
  
  int *a;
  
  a = (int *)calloc(num, sizeof(int));
  for(int i=0;i<num;i++){
    cin >> *(a+i);
    
    if(*(a+i)%2==0)
      	f++;
    
    else
      	m++;
  }
  
  cout << m << endl;
  cout << f << endl;
  
  return 0;
}