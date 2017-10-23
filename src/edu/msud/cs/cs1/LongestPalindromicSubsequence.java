package edu.msud.cs.cs1;


import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindromicSubsequence {


    String longestPalindrome (ArrayList args) {
        String str = new String();
        for(int i = 0; i < args.size(); i++) {
            String palins = (String)args.get(i);
            StringBuilder argsBuilder = new StringBuilder((String)args.get(i));
            for(int j = 0; j < palins.length(); j++) {
                if (palins.equalsIgnoreCase(argsBuilder.reverse().toString())) str += palins;
                else if (palins.substring(j, j + 1).equalsIgnoreCase(argsBuilder.substring(j, j + 1).toString()))
                    str += palins;
            }
        }
            String longest = (String)args.get(0);

            if (args.size() == 0) return longest;
            else {
                for (int i = 1; i < args.size(); i++) {
                    String palins = (String)args.get(i);
                    String palinsMinusOne = (String)args.get((i-1));
                    if (palins.length() > longest.length()) {
                        longest = palins;
                        args.remove(i);
                        longestPalindrome(args);
                    }
                }
            }
            return longest;
    }


    public static void main (String[] args)
    {
        System.out.println("Input argument string is:");
        for(int i = 0; i < args.length; i++)
            System.out.print(args[i] + " ");
        ArrayList cmdArgs = new ArrayList(Arrays.asList(args));
        LongestPalindromicSubsequence palindrome = new LongestPalindromicSubsequence();
        System.out.println();
        System.out.println("The first longest palindrome in this string is " + palindrome.longestPalindrome(cmdArgs));
    }
}
