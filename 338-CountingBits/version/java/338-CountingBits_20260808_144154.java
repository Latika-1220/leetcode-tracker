// Last updated: 08/08/2026, 14:41:54
1class Solution {
2    public int[] countBits(int num) {
3    int result[] = new int[num + 1];
4    int offset = 1;
5    for (int index = 1; index < num + 1; ++index){
6        if (offset * 2 == index){
7            offset *= 2;
8        }
9        result[index] = result[index - offset] + 1;
10    }
11    return result;
12    }
13}