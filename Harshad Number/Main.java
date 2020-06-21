#include<iostream>
using namespace std;
int main()
{
  int number,n,sum=0,rem;
  cin >> number;
  n=number;
  while(n !=0){
    rem = n%10;
    sum = sum + rem;
    n/=10;
  }
  
  if(number%sum == 0)
    cout << "Harshad Number";
  else
    cout << "Not Harshad Number";
}