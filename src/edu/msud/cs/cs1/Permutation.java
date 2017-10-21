package edu.msud.cs.cs1;

import edu.princeton.cs.introcs.StdArrayIO;

import java.util.Arrays;

public class Permutation {


    void printPermutations (String head, String tail)
    {
        if(tail.length() == 0) System.out.println(head);
        else {
            for (int i = 0; i < tail.length(); i++) {
                StringBuffer newTail = new StringBuffer(tail);
                newTail.deleteCharAt(i);
                printPermutations(head + tail.charAt(i), newTail.toString());

            }
        }

    }

    public static void main(String[] args) {
        char[] az = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'};

        String str = new String();
        for(int i = 0; i < Integer.parseInt(args[0]); i++)
        {
            str += az[i];
        }
        Permutation permutation = new Permutation();
        permutation.printPermutations("",str);



    }

}
