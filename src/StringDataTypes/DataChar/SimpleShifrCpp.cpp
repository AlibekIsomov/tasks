#include <iostream>
using namespace std;
int main(){
char c;
while(cin >> c)
    cout << char (c == 'z' ? 'a':c+1);
    return 0;
}