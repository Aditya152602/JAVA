//import java.util.HashSet;
public class day18RecursionClass2 {
    // Que:Tower of Hanoi.
/*    public static void towerOHanoi(int n,String src, String helper , String dest){
      if(n==1){
          System.out.println("transfer disk "+ n +"from"+src+"to "+dest);
          return;
        }  
          towerOHanoi(n-1,src,dest,helper);
       System.out.println("Transfer disk "+ n +" from  "+src+"to "+dest);
       towerOHanoi(n-1,helper,src,dest);
    }   
    public static void main(String args[]){
        int n = 3;
        towerOHanoi(n, "S", "H", "D");
    }

    //                                          Print a string in reverse.
    
  public static  void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args){
        String str = "Aditya";
        printRev(str,str.length()-1);
    }

    //                                Find the 1st & last occurance of an element in string.

    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char element){
        if (idx== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element){
            if(first == -1){
                first = idx;
            }else {
                last = idx;
            }
        }
        findOccurence(str,idx+1,element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        findOccurence(str , 0, 'a');
    }

    //                                  Check if an array is sorted (Strictly Increasing).

    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now.
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,2};
        System.out.println(isSorted(arr,0));
    }

    //                                      Move all 'x' to the end of the string.

    public static void moveALLX(String str, int idx , int count, String newString){
        if (idx == str.length()){
            for (int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            moveALLX(str, idx+1, count,newString);
        }else{
            newString += currChar;
            moveALLX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveALLX(str, 0, 0,"");
    }

   //                                            Remove duplicates in a string.

  public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str , int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
         String str = "abbccda"; 
         removeDuplicates(str, 0, "");
    }

    //Print all the subsequences of a string.[MOST IMPORTANT FOR  PLACEMENT INTERVIEW]

    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //To be
        subsequences(str,idx+1, newString+currChar);
        //Or not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str,0,"");
    }

    //Print all the unique subsequences of a string.[MOST IMPORTANT FOR  PLACEMENT INTERVIEW]

    public static void subsequences(String str, int idx, String newString, HashSet<String> set ){
        if(idx == str.length()){
            if (set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //To be
        subsequences(str,idx+1, newString+currChar,set);
        //Or not to be
        subsequences(str, idx+1, newString,set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str,0,"",set);
    }*/

    //Print keypad combination.

 public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printComb(String str,int idx , String combination){
        if (idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i=0; i<mapping.length();i++){
            printComb(str, idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main (String args[]){
         String str = "23";
         printComb(str,0,"");
   }
}
