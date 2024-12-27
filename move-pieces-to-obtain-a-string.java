//ProblemStatement
// The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if there is a blank space directly to its left,
// and a piece 'R' can move to the right only if there is a blank space directly to its right.

// Expected output
// Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times. 
// Otherwise, return false.

 
class Solution {
// Input: start = "_L__R__R_", target = "L______RR"
// Output: true
    public boolean canChange(String start, String target) {
      if(start.equals(target)) {
        return true;
      }
      int waitRs = 0;
      int waitLs = 0;
      for(int i = 0; i < start.length(); i++) {
        char src = start.charAt(i);
        char tar = target.charAt(i);
        
        if(src == 'R') {
            if(waitLs > 0) {
                return false;
            }
            waitRs++;
        }
        if(tar == 'R') {
           if(waitRs == 0) {
             return false;
           }
           waitRs--;
        }

        if(tar == 'L') {
            if(waitRs > 0) {
                return false;
            }
            waitLs++;
        }

        if(src == 'L') {
            if(waitLs == 0) {
                return false;
            }
            waitLs--;
        }

      }
      return waitRs == 0 && waitLs == 0;
    }
}