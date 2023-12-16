#include <bits/stdc++.h>
using namespace std;
void sort012(int a[],int n){
    int zero=0,one=0,two=0;
    for(int i=0;i<n;i++){
        if(a[i]==0){
            zero++;
        }
        else if(a[i]==1){
            one++;
        }
        else{
            two++;
        }
    }
    
    for(int i=0;i<zero;i++){
        a[i]=0;
    }
    for(int i=zero;i<zero+one;i++){
        a[i]=1;
    }
    for(int i=zero+one;i<zero+one+two;i++){
        a[i]=2;
    }
    
    cout<<"final output is "<<endl;
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}

void sort(int a[],int n){
    int low=0,mid=0,high=n-1;
    while(mid<=high){
        if(a[mid]==0){
            swap(a[mid],a[low]);
            mid++;
            low++;
        }
        else if(a[mid]==1){
            mid++;
        }
        else{
            swap(a[mid],a[high]);
            high--;
        }
    }
    cout<<"final output is "<<endl;
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}
int main(){
    int a[]={1,2,0,2,1,1,0};
    int n=sizeof(a)/sizeof(a[0]);
    sort012(a,n);
    cout<<endl;
    cout<<"using second way"<<endl<<endl;
    sort(a,n);
}