#include <iostream>
#include<cmath>
#include<algorithm>
 
using namespace std;
int main() {
double m,n,a;
long long x,z;
cin>>m>>n>>a;
x=ceil(m/a);
z=ceil(n/a);
cout<<x*z;
    return 0;
    
}
