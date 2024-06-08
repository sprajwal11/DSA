import java.util.HashSet;

public class Recursion {

    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static void printCombo(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar - '0'];

        for (int j = 0; j < mapping.length(); j++) {
            printCombo(str, i + 1, combination + mapping.charAt(j));

        }
    }


    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (target < arr[mid]) {
            e = mid - 1;
        } else if (target > arr[mid]) {
            s = mid + 1;
        } else {
            return mid;
        }
        return search(arr, target, s, e);

    }

    static void printStringInReverse(String str, int i) {
        if (0 == i) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        printStringInReverse(str, --i);
    }

    static void findFirstAndLastOccurance(String str, char target, int i, int first, int last) {
        if (str.length() == i) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(i) == target) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        findFirstAndLastOccurance(str, target, ++i, first, last);
    }

    static boolean checkIfArrayIsSorted(int[] arr, int i, boolean isSorted) {

        if (arr.length == i) {
            return isSorted;
        }
        if (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            //System.out.println(false);
            return false;
        } else {
            return isSorted = checkIfArrayIsSorted(arr, ++i, true);
        }

    }

    static String moveAllx(String str, int i, int count, String newStr) {
        if (str.length() == i) {
            for (int j = count; j > 0; j--) {
                newStr += 'x';
            }
            return newStr;
        }
        if (str.charAt(i) == 'x') {
            return moveAllx(str, ++i, ++count, newStr);
        } else {
            newStr += str.charAt(i);
            return moveAllx(str, ++i, count, newStr);
        }
    }

    static void removeDuplicate(String str, int i, String newStr, boolean[] map) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(i) - 'a'] == true) {
            removeDuplicate(str, ++i, newStr, map);
        } else {
            newStr += str.charAt(i);
            map[str.charAt(i) - 'a'] = true;
            removeDuplicate(str, ++i, newStr, map);
        }
    }

    static void subSequences(String str, int i, String newString) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);

        subSequences(str, i + 1, newString + currChar);
        subSequences(str, i + 1, newString);
    }

    static void uniqueSubSequences(String str, int i, String newString, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(i);
        uniqueSubSequences(str, i + 1, newString + currChar, set);
        uniqueSubSequences(str, i + 1, newString, set);
    }

    static void printNumsInDeceasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumsInDeceasingOrder(n - 1);
    }

    private static void printNumsInIncreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        printNumsInIncreasingOrder(n - 1);
        System.out.println(n);
    }

    static int printFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    private static int sumOfNatualNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNatualNums(n - 1);
    }

    static int firstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, ++i);
    }

    static int lastOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    static int powerBF(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * powerBF(n, p - 1);
    }

    static int powerOptimized(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int half=powerOptimized(n, p / 2);
        int halfPowerSq =  half*half;

        //n is odd
        if (p % 2 != 0) {
            halfPowerSq = n * halfPowerSq;
        }
        return halfPowerSq;
    }

    static int tilingProblem(int n){
        if (n==0 || n==1){
            return 1;
        }

        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);

        int totalWays=fnm1+fnm2;

        return totalWays;
    }

    static void removeDuplicates(String str,int i,StringBuilder newStr, boolean[] map){
        if (i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(i);
        if (map[currChar-'a']==true){
            removeDuplicates(str,i+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str,i+1,newStr.append(currChar),map);
        }

    }

    static int friendsPairing(int n){
        if (n<=2){
            return n;
        }
        //single
        int fnm1=friendsPairing(n-1);
        //pairs
        int fnm2=friendsPairing(n-2);
        int pairWays=(n-1)*fnm2;

        int totalWays=fnm1+pairWays;

        return totalWays;

    }

    static void printBinaryStrings(int n,int lastPlace, String str){

        if (n==0){
            System.out.println(str);
            return;
        }
//        if (lastPlace==0){
//            printBinaryStrings(n-1,0,str.append("0"));
//            printBinaryStrings(n-1,1,str.append("1"));
//        }
//        else {
//            printBinaryStrings(n-1,0,str.append("0"));
//        }

        printBinaryStrings(n-1,0,str+"0");
        if (lastPlace==0){
            printBinaryStrings(n-1,1,str+"1");
        }
    }




    public static void main(String[] args) {
        //System.out.println(fibo(2));
        //  int[] array = {1,2,3,4,5,6,7} ;
//        int target2 = 77;
//        System.out.println(search(array,target2,0, array.length-1));
        //printStringInReverse("hello",4);

//        findFirstAndLastOccurance("babaa",'a',0,-1,-1);
        // System.out.println(checkIfArrayIsSorted(array,0,false));
        // System.out.println(moveAllx("axbxcx",0,0,""));
//        removeDuplicate("abcadzzzdec",0,"",new boolean[26]);
        //  HashSet<String> set=new HashSet<>();
        //    subSequences("abc",0,"");
        //  uniqueSubSequences("aaa",0,"",set);

        // String str="4";
        // printCombo(str,0,"");

        // printNumsInDeceasingOrder(10);
        //  printNumsInIncreasingOrder(10);
        // System.out.println(printFactorial(9));
        //System.out.println(sumOfNatualNums(5));

        //  int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        //System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr,5,0));
       // System.out.println(powerOptimized(2, 10));

      //  System.out.println(tilingProblem(4));

        //removeDuplicates("apnacollege",0,new StringBuilder(),new boolean[26]);
        //System.out.println(friendsPairing(0));
        printBinaryStrings(3,0,"");
    }


}
