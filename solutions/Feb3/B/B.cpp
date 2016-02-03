#include<string>
#include<algorithm>
#include<iostream>
#include<vector>
#include<map>
using namespace std;

int N;
string s,t;
map<string,int> group;
long long pairs;
char bij[30];

void transform(string &s) {
    t = "";
    for(int i=0;i<26;++i) {
        bij[i] = 0;
    }
    char current = 'a';
    for(int i=0;i<s.size();++i) {
        if(!bij[s[i]-'a']) {
            bij[s[i]-'a'] = current;
            ++current;
        }
        t.push_back(bij[s[i]-'a']);
    }
}

int main() {
    cin>>N;
    for(int i=1;i<=N;++i) {
        cin>>s;
        transform(s);
        pairs += group[t];
        ++group[t];
    }
    cout<<pairs;
    return 0;
}
