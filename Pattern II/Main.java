#include<iostream>
using namespace std;

int main(){
  int num,term,n_term;
  
  cin >> num;
  
  for(int i=1;i<=num;i++){
    
    if(i%2!=0){
      for(term=n_term+1;term<n_term+i;term++)
        cout << term << "*";
      cout << term++ << endl;
      
      n_term = term;
    }
    
    else{
      n_term = n_term + i - 1;
      
      for(term=n_term;term>n_term-i+1;term--)
        cout << term << "*";
      cout << term << endl;
    }
  }
}