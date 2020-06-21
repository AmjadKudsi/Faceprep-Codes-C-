#include<iostream>
using namespace std;
int main()
{
  int num, term = -2, add=2, count=0;
  cin >> num;
  
  while(1){
    for(int j=0; j<2; j++){
      term += add;
      cout << term << " ";
      count++;
      
      if(count == num)
        goto label;
    }
    add += 4;
    
  }
	
  label:
  	cout<<" ";
}