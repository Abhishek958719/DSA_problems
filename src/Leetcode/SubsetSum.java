package Leetcode;

import java.util.ArrayList;

public class SubsetSum {
    ArrayList<Integer>ans;
    void solve(ArrayList<Integer>arr,int n,int sum){
        if(n<0){
            ans.add(sum);
            return;
        }
        sum += arr.get(n);
        solve(arr,n-1,sum);
        sum -= arr.get(n);
        solve(arr,n-1,sum);
    }
    ArrayList<Integer> SubsetSum(ArrayList<Integer>arr,int N){
        int sum=0;
        solve(arr,N,sum);
        return ans
    }
    public static void main(String []argv){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ans = SubsetSum(arr,arr.size()-1);

    }
}
