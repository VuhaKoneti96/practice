/*
* Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.
* Return an array ans of size queries.length, where ans[i] is the answer to the ith query.
* Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.
* Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
* Output: [2,3,0]
* Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
* The answer to the query [0,2] is 2 (strings "aba" and "ece").
* to query [1,4] is 3 (strings "ece", "aa", "e").
* to query [1,1] is 0.
* We return [2,3,0].
*/

class CountVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        String vowels = "aeiou";
        int[] ans = new int[queries.length];
        int[] pre = new int[words.length];
        
        for(int i = 0; i < words.length; i++) {
            if(vowels.indexOf(words[i].charAt(0)) > -1 && 
                vowels.indexOf(words[i].charAt(words[i].length() -1)) > -1)
               pre[i]++;
        }
        for(int i = 1; i < words.length; i++) {
            pre[i] = pre[i] + pre[i-1];
        }
        for(int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 0) {
                ans[i] = pre[queries[i][1]];
            } else {
                ans[i] = pre[queries[i][1]]-pre[queries[i][0] - 1];
            }
        }


        return ans;
    }
        
    }
