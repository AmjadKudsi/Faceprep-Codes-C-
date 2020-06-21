#include<iostream>
using namespace std;
int main()
{
  int num;
  cin >> num;
  int n = 7;
  
  for(int i=0;i<num;i++){
    n += 4;
    int square = n*n;
    cout << square << " ";
  }
  
}