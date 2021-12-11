#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    long long n,c=0;
    cin>>n;
    vector<long long> v;
    
    for(long long i=0; i<n; i++){
        int x; cin>>x;
        v.push_back(x);
        if (i!=0) 
        if(v[i-1] != v[i]) c++;
    }
    
    cout<<c+1;
    
    return 0;
}
