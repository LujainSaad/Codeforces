#include <bits/stdc++.h>
 
using namespace std;
 
 
int main()
{
    int n,sum=0;
    cin>>n;
    
    for (int i=0;i<n; i++){
       string str; cin>>str;
        if (str.find("+") != string::npos) sum++;
        else sum--;
    }
    
    cout<<sum;
}
