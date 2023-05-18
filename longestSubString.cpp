#include <iostream>
using namespace std ;

int LCS(string str) {
    if (str.empty()) {
        return 0;
    }

    int maxLength = 0;
    int windowStart = 0;
    int windowEnd = 0;

    for (int i = 0; i < str.length(); i++) {
        for (int j = windowStart; j < i; j++) {
            if (str[j] == str[i]) {
                windowStart = j + 1;
                break;
            }
        }
        windowEnd = i + 1;
        maxLength = max (maxLength, windowEnd - windowStart);
    }

    return maxLength;
}

int main() {
string str ; 
cout << " Enter the string shreyas "<< endl ;
cin >> str  ;
    int length = LCS(str);
    cout << "Length is : " << length ;
    return 0;
}

