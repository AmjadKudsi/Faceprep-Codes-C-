#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n, days;
  cin >> n;
  
  days = n + sqrt(n) + 1;
  
  cout << days;
}