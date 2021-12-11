#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int n; cin>>n;
    string s; cin>>s;
    string alphabet = "abcdefghijklmnopqrstuvwxyz";
    bool state =true;
    
    for (int i = 0; i < s.length(); i++)
  	{
  		s[i] = tolower(s[i]);
  	}
  	for( char c : alphabet) {
  	    
    if (s.find(c) != string::npos) continue; 
    else {
        state =false; break;
    }
  	}
    
    if(state) cout<<"YES";
    else cout<<"NO";
 
    return 0;
}
