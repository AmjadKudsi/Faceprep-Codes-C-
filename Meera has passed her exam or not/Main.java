#include<iostream>
using namespace std;

int main()
{
  int n, m_num;
  cin >> n;
  
  int num[n];
  
  for(int i=0; i<n; i++){
    cin >> num[i];
  }
  
  cin >> m_num;
  
  for(int i=0; i<n; i++){
    if (num[i] == m_num){
      cout << "She passed her exam";
    	goto label;
    }
  }
  
  cout << "She failed";
  
  label:
  cout << " ";
}