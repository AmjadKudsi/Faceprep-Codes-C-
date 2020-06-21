#include<iostream>
using namespace std;

int main(){
  float num;
  cin >> num;
  
  float p_term = 0.5;
  cout << p_term << " ";
  
  for(int i = 1; i< num; i++){
    float mul = p_term*2;
    p_term += mul;
    cout << p_term << " ";
  }
}