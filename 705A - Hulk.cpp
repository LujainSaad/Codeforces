#include <bits/stdc++.h>

using namespace std;


int main()
{
    int n;
    string s= "I hate";
    cin>>n;
    for(int i=1;i<=n;i++){
        if (n==1 || i==n) {s+=" it"; break;}
        else if (i%2!=0) s+= " that I love";
        else s+= " that I hate";
    }
    
   cout<<s;
}
