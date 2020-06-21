#include<iostream>
using namespace std;

int d_sum(int n){
    int rem=0, sum=0;
    
    while(n>0){
        rem = n%10;
        sum += rem;
        n /= 10;
    }
    
    if(sum<10){
        cout << sum;
        return 0;
    }
    
    else
        d_sum(sum);
}

int main(){
    int num;
    cin >> num;
    d_sum(num);
}