
 #include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n, countE, countO, lastE, lastO; 
    cin>>n;
    countE =countO = lastE = lastO =0;
    
    for(int i=0; i<n ; i++){
        int x; cin>>x;
        if(x%2==0) { countE++; lastE=i; }
        else { countO++; lastO=i; }
    }
    
    if(countE<countO) cout<<lastE+1;
    else cout<<lastO+1;
    
    return 0;
}
