package Leetcode;

public class ReverseWordInString {
    static String Solve(String s){
        String resp = "";
        String[] word = s.split(" ");
        for(int i=0;i<word.length;i++){
            StringBuilder str = new StringBuilder(word[i]);
            resp = resp + " " + str.reverse();
        }
        return resp.substring(1);
    }
    public static void main(String []argv){
        String s1="Hello how are you";
        String resp1 = Solve(s1);
        System.out.print(resp1);
    }
}
