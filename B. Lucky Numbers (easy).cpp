#include <bits/stdc++.h>

using namespace std;


vector<long long> allSuperLuckyNumbers;

void genAllLuckyNumbers(long long value,int nbr4,int nbr7){

// base case
    if (value>1e10) return;

    if(nbr4==nbr7)
        allSuperLuckyNumbers.push_back(value);

    // recursive case
    genAllLuckyNumbers(value*10+4,nbr4+1,nbr7);
    genAllLuckyNumbers(value*10+7,nbr4,nbr7+1);

}
int main()
{

long long n;
cin>>n;


genAllLuckyNumbers(0,0,0);

sort(allSuperLuckyNumbers.begin(),allSuperLuckyNumbers.end());

int pos=lower_bound(allSuperLuckyNumbers.begin(),allSuperLuckyNumbers.end(),n)-allSuperLuckyNumbers.begin();

cout<<allSuperLuckyNumbers[pos];

// to print all generated super lucky numbers
/*
for(int i=0;i<allSuperLuckyNumbers.size();i++){
    cout<<allSuperLuckyNumbers[i]<<endl;
}
*/



    return 0;
}
