/*
When n is even, the operation is fixed. 
The procedure is unknown when it is odd. 
When n is odd it can be written into the form n = 2k+1 (k is a non-negative integer.). 
That is, n+1 = 2k+2 and n-1 = 2k. Then, (n+1)/2 = k+1 and (n-1)/2 = k. 
So one of (n+1)/2 and (n-1)/2 is even, the other is odd. 
And the "best" case of this problem is to divide as much as possible. 
Because of that, always pick n+1 or n-1 based on if it can be divided by 4. 
The only special case of that is when n=3 you would like to pick n-1 rather than n+1.
*/

public class Solution {
    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) 
            return 32;
        int count = 0;
        while (n > 1) {
            if ((n & 1) == 0) n >>= 1;
            else {
                if ((n + 1) % 4 == 0 && n != 3)
                    n++;
                else
                    n--;
            }
            count++;
        }
        return count;
    }
}