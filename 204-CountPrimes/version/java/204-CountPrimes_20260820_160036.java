// Last updated: 20/08/2026, 16:00:36
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2)
4            return 0;   
5        int[] notPrime = new int[n + 1];
6        int count = n - 2;
7        int prime = 2;   
8        while (prime * prime < n) {
9            if (notPrime[prime] == 0)
10                for (int num = prime + prime; num < n; num += prime)
11                    if (notPrime[num] == 0) {
12                        count--;
13                        notPrime[num] = 1;
14                    }         
15            prime++;
16        }
17         return count;
18    }
19}