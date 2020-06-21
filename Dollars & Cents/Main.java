#include<iostream>
using namespace std;
int main()
{
  int d1, d2, c1, c2, d_sum, c_sum;
  cin >> d1 >> c1 >> d2 >> c2;
  
  d_sum = d1 + d2;
  c_sum = c1 + c2;
  
  if(c_sum > 100){
    d_sum += c_sum/100;
    c_sum %= 100;
  }
  
  cout << d_sum << endl;
  cout << c_sum << endl;
}