#include<string>
#include<iostream>
using namespace std;

int N;
string a,b,c;

int main() {
	cin>>N;
    cin>>a>>b>>c;
    for(int i=0;i<N;++i) {
        if(b[i] == c[i]) {
            cout<<b[i];
        } else {
            cout<<a[i];
        }
    }
    return 0;
}
