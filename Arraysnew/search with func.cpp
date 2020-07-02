#include <iostream>
using namespace std;
int searchElement(int *arr,int n,int x)
{
    for(int i=0;i<n;i++)
    {
        if(arr[i]==x)
        {
            return i;
            
        }
    }
    return -1;
        
    
    
}
int main() {
    int arr[]={20,5,7,25,43,87};
    int x=25;
    int n=sizeof(arr)/sizeof(arr[0]);
    int ans=searchElement(arr,n,x);
    cout<<ans;
    
}
