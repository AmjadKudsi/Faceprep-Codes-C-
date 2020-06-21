#include<iostream>
using namespace std;

int main()
{
  int n, h_mark=0;
  cin >> n;
  
  int marks[n];
  
  for(int i=0; i<n; i++){
    cin>>marks[i];
    
    if(marks[i] > h_mark)
      h_mark = marks[i];
  }
  
  cout << h_mark;
}