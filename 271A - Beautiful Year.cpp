#include <bits/stdc++.h>
 
using namespace std;
 
vector<long long> allDistinctYears;
 
void genAllYears(int year){
    if(year > 9100) return;  //base case
    
    vector<long long> yearV;
    int c=year;
    
    while(c>0){ 
        yearV.push_back(c%10);
        c/=10;
    }
    
    if( yearV[0]!= yearV[1] && yearV[0]!= yearV[2]&& yearV[0]!= yearV[3] && yearV[1]!= yearV[2] && yearV[1]!= yearV[3]
    && yearV[2]!= yearV[3])
    allDistinctYears.push_back(year);
    
    //recursive case
    genAllYears(year+=1);
}
 
int main(){
    int n;
    cin>>n;
    genAllYears(1000);
    int pos=lower_bound(allDistinctYears.begin(),allDistinctYears.end(),n+1)-allDistinctYears.begin();
    cout<<allDistinctYears[pos];
    
    // for (auto x : allDistinctYears)
    // cout<<x<<endl;
 
    
    return 0;
