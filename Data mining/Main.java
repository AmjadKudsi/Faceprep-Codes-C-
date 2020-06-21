#include<iostream>
using namespace std;
int main()
{
  int num, e_sum=0, o_sum=0;
  cin >> num;
  int s = num;
  
  while(s!=0){
	int rem = s%10;
    if(rem%2 == 0)
      e_sum += rem;
    else
      o_sum += rem;
    
    s /=10;
  }
  
  if (e_sum == o_sum)
    cout << "Yes";
  else
    cout << "No";
}