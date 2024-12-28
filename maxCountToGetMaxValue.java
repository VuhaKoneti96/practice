import java.util.Arrays;

import java.util.Arrays;

/*
 * Get the max count of numbers to be added to get the maxSum given. 
 * The numbers to be added should be lessthan n and shouldn't be repeated
 * i/p  banned = [1,6,5], n = 5, maxSum = 6
 * o/p = 2
 */

class maxCountToGetMaxValue {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr=new int[10001];
        for(int i=0; i<banned.length; i++){
            arr[banned[i]]=1;
        }

        long sum=0;
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(arr[i]==1){continue;}
            sum+=i;
            if(sum>maxSum){
               break;
            }
            cnt++;
        }

        return cnt;
    }
    
    public int methodMine (int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int count = 0;
        int result = 0;
        int i = 1;
        if(maxSum == 0) {
            return 0;
        }
        if(n > maxSum)
        n = maxSum;
           
        while(i <= n) {
            if(Arrays.binarySearch(banned, i) < 0) {
                 result += i;
                if(result > maxSum) {
                   return count;                  
                }
                    count ++;
               }
             i += 1;
        }
        return count;
    }
}