#include<bits/stdc++.h>
using namespace std;
/* The function should return the index of any
   peak element present in the array */

// arr: input array
// n: size of array
class Solution
{
    public:
    int peakElement(int arr[], int n)
    {
       // Your code here
       for(int i=1;i<n-1;i++)
       {
           if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                return i;
       }
       return n-1;
    }
};