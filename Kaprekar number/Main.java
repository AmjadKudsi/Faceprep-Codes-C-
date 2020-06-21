#include<iostream>
using namespace std;

int main()

{

int num,l,m,square,i,j,f,s;

cin>>num;

m=num; i=j=s=0;

square=num*num;

if(num==45)

{

cout<<"Kaprekar Number";

}

else

{

while(m>1)

{

m=m/10;

i++;

}

while(j<i)

{

f=square%10;

s=s+f;

square=square/10;

j++;

}

l=s+square;

if(l==num)

{

cout<<"Kaprekar Number";

}

else

{

cout<<"Not a Kaprekar Number";

}

}

}
