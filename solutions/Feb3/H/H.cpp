#include<stdio.h>
#include<bitset>
#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;
int N;
string s,t;

int main() {
	cin>>N>>s>>t;
    bool dif = false;
    int cnt = 0;
    for(int i=0;i<N;++i) {
        if(s[i] != t[i]) {
            if(!dif) {
                dif = true;
                ++cnt;   
            }
        } else {
            dif = false;
        }

    }
    cout<<cnt;
    return 0;
}
