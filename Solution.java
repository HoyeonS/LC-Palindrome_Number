class Solution {
    public static int getDigit(int x)
    {
        int count = 1;
        int a = x;
        
        while(a/10 > 0)
        {
            count++;
            a = a/10;
        }
        return count;
    }
    
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        for (int i = 0; i < getDigit(x)/2; i++)
        {
            int first = (int)((x / Math.pow(10,getDigit(x) - 1 - i)) % 10);
            int last = (int)(x % Math.pow(10, i + 1) / Math.pow(10, i));
            System.out.println("first: " + first + "last: " + last);
            if(first != last)
                return false;
        }
        return true;
        
        
    }
}