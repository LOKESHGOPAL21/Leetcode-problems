class Solution {
    public static long pow(long x, long n) {
        long mod = 1000000007;
        long res = 1;
        
        x %= mod;
        
        while (n > 0) {
            if (n % 2 == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            n /= 2;
        }
        
        return res;
    }

    public int countGoodNumbers(long n) {
        long mod = 1000000007;

        long even = (n+1)/2;
        long odd = n/2;

        long resEven = pow(5, even);   
        long resOdd = pow(4, odd);     

        long result = (resEven * resOdd) % mod;
        return (int) result;
    }
}
