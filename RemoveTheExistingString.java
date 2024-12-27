// Expected output [v11, v12, version145, verhakspofnds1, version2, vukoha]
// replace the string which has all of its characters in another string with that.
/* Online Java Compiler and Editor */
import java.util.*;

public class RemoveTheExistingString {

    public static void main(String []args) {
      this.method1();
      this.method2();
    }

    public method1() {
     String[] arr = {"v1", "version1", "ver2", "version2", "vuha", "vukoha", "verhakspofnds1", "version145", "v12", "v11"};
      LinkedHashSet<String> newArr = new LinkedHashSet<String>();
      int i = 0; 
      newArr.add(arr[0]);
      for(String str: arr) {
         char[] c = str.toCharArray();
         int j = arr.length-1;
         while(j > i) {
          int count = 0;
          for(char ch: c) {
            if(arr[j].contains(String.valueOf(ch)))
            count++;
          }
          if(count == str.length()) { 
            newArr.add(arr[j]);
            newArr.remove(arr[i]);
            System.out.println(newArr);
            
          } else if(count == arr[j].length()) {
            newArr.remove(arr[j]);
            newArr.add(arr[i]);
            System.out.println(newArr);
          }
          j--;
        }
            
        i++;
      }
      
      System.out.println(newArr);
  
    }

    public method2() {
     String[] arr = {"v1", "version1", "ver2", "version2", "vuha", "vukoha", "verhakspofnds1", "version145", "v12", "v11"};
      LinkedHashSet<String> newArr = new LinkedHashSet<String>();
       for(int i = 0; i < arr.length; i++) {
           for(int j = arr.length - 1 ; j > i; j-- ) {
               int count = 0;
                for(char ch: arr[i].toCharArray()) {
                    if(arr[j].contains(String.valueOf(ch)))
                    count++;
                }
                
                if(count == arr[i].length()) { 
                    newArr.add(arr[j]);
                    newArr.remove(arr[i]);
                } else if(count == arr[j].length()) {
                    newArr.remove(arr[j]);
                    newArr.add(arr[i]);
                }
           }
       }
       System.out.println(newArr);
    }
}