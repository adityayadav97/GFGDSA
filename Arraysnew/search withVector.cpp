#include <iostream>
#include<vector>
using namespace std;
int searchElemnt(vector<int> vect,int x)
{
    for(int i=0;i<vect.size();i++)
    {
        if(vect[i]==x)
        {
            return i;
        }
    }
    return -1;
}
int main() {
    vector<int> vect{ 20 ,5,7,25,78 };
    int x=7;
    int ans=searchElemnt(vect,x);
    cout<<ans; 
}
