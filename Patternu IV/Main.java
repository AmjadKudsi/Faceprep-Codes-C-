#include <iostream>
using namespace std;
int main() {
    int num,j,k;
    cin >> num;
  
  for(int i=1;i<=num;i++){
    if(i%2!=0){
      int a=i;
      for(j=1;j<num;j++)
        cout << a;
      cout << ++a << endl;
      
      k = a;
    }
    
    else{
      cout << k+1;
      
      for(j=1;j<num;j++)
        cout << k;
      cout << endl;
    }
  }
    return 0;
}