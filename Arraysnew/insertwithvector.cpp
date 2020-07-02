#include <iostream>
#include<vector>
using namespace std;
int InsertElement(vector<int> vect,int pos,int x)
{
    if(vect.size()==0)
    {
        return vect.size();
    }
    int index=pos-1;
    for(int i=vect.size();i>=index;i--)
    {
        vect[i+1]=vect[i];

    }
vect[index]=x;
    return (vect.size()+1);
}
int main() {
     vector<int > vect{23,43,21,32,12};
    int pos=3;
    int x=65;
    int ans=InsertElement(vect,pos,x);
    cout<<ans;

}
