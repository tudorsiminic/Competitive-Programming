#include<stdio.h>
#include<bitset>
#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;
int N,a,b,k,rez;

int main() {
	std::ios_base::sync_with_stdio (false);
    cin>>N;
    for(int i=1;i<=N;++i) {
        cin>>a>>b;
        if(a > k) {
            rez = max(rez,b);
            k = a;
        }
    }
    cout<<rez;
	return 0;
}
