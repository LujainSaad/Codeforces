#include <bits/stdc++.h>

using namespace std;


int main()
{
    float n,z;
    float m=0;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>z;
        m+=z;
    }
    
   cout<<(m/(n*100))*100;
}
