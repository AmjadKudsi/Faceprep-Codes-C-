#include<iostream>
using namespace std;
int main()
{
  int rem, number, count = 0;
  cin >> number;
  
  if(number == 0)
    count=1;
  else{
  	while(number != 0)
  	{
    	number /= 10;
    	count++;
  	}
  }
  cout << count;
}