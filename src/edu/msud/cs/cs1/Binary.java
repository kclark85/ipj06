package edu.msud.cs.cs1;

public class Binary {


    void binary(int n)
    {

        if (n > 1) // base case
            binary(n/2); // recursion call -- repeats until n is no longer greater than 1 (base case) because until then, n/2 is unknown to the program
        System.out.print(n%2); //gives actual binary result once recursion loop is complete
    }

    public static void main (String[] args)
    {
        Binary binary = new Binary();
        binary.binary(24);
    }
}
