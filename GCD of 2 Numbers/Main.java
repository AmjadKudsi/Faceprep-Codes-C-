#include<iostream>
using namespace std;

int min(int* a, int* b){
    if(*a<*b)
     return 0;
     
    else{
        int temp = *a;
        *a = *b;
        *b = temp;
        return 0;
    }
}

int gcd(int o, int t, int e){
  
    if(o%e==0 && t%e==0)
      return e;
      
    else
		return(gcd(o,t,e-1));
}

      int main(){
        int one, two;
        cin >> one >> two;
        cout << "G.C.D of " << one << " and " << two << " = "; 
          
        min(&one,&two);
        
        cout << gcd(one,two,one);
}