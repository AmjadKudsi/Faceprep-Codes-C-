#include<iostream>
using namespace std;
int pow(int n,int p){
  if(p == 0)
    return 1;
  
  	return(n*pow(n,p-1));
}

int main()
{
  int num,power;
  
  cout << "Enter the value of a" << endl;
  cin >> num;
  
  cout << "Enter the value of n"<< endl;
  cin >> power;
  
  cout << "The value of " << num << " power " << power << " is " << pow(num,power);
}