package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSumII {

    static void printList(List<List<Integer>>ans){
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(","," "));
    }
    static void Solve(int indx,int[] nums, ArrayList<Integer>ds, List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));

        for(int i=indx;i<nums.length;i++){
            if(i!=indx && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            Solve(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    static List<List<Integer>> SubsetSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Solve(0,nums,ds,ans);
        return ans;
    }
    public static void main(String []argv){
        int nums[]={1,2,2};

        List<List<Integer>>ans = SubsetSum(nums);

        printList(ans);


    }
}
