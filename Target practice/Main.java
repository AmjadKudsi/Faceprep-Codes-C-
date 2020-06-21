#include<iostream>
using namespace std;
int main()
{
  int target, turn, sum=0,count=0;
  cin >> target;
  
  while(turn != 0){
    count++;
    cin >> turn;
  	sum += turn;
  
  if(sum<target)
    continue;
  
  else if(sum >= target)
    break;
    }
  
  cout << "The number of turns is " << count;
}