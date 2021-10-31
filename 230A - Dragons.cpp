#include <bits/stdc++.h>
using namespace std;
 
 
int main()
{
     int n,s;
     std::cin>>s>>n;
     list< pair<int,int> >::iterator it;
     list< pair< int, int > > level;
     bool pass =true;
     
    for(int i=0;i<n;i++){
        int x,y;
      std::cin>>x>>y;
      level.push_back( make_pair( x, y) );;
     }
     
     level.sort();
    
    for (it=level.begin(); it!=level.end(); ++it) {
       if(s > it->first) s+= it->second; 
       else {pass =false; break;}
    }
     
     if (pass) std::cout <<"YES"<<std::endl;
     else  std::cout <<"NO" << std::endl;
    
}
