#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n,b;
    std::cin>>n>>b;
    vector<int> cuts;
    int arr[n];
     
    for ( int i=0; i<n ;i++){
        std::cin>>arr[i];
    }
    
    int even, odd;
    even = odd =0;
    
    for ( int i=0; i<n-1 ;i++){
        
        if(arr[i]%2==0) even++;
        else odd++;
        
        if(even==odd)
        cuts.push_back(abs(arr[i+1]-arr[i]));
    }
    
    sort(cuts.begin(), cuts.end());
    
    int ans=0;
    for (auto x : cuts)
        if(b>=x) {
				ans++;
				b-=x;
			}
    
    std::cout <<ans<<std::endl;
 
}
