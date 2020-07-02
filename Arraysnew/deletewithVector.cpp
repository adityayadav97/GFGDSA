#include <iostream>
#include<vector>
using namespace std;
int DeleteElemnt(vector<int> vect,int x){
    for(int i=0;i<vect.size();i++)
    {
        if(vect[i]==x)
        {
            break;
        }
        if(i==vect.size())
        {
            return vect.size();
        }
        for(int j=i;j<vect.size();j++)
        {
            vect[j]=vect[j+1];
        }   
    }      
    return (vect.size()-1);
}
int main() {
    vector<int > vect{23,43,54,32,53,49};
    int x=43;
    int ans=DeleteElemnt(vect,x);
    cout<<ans;    
}
