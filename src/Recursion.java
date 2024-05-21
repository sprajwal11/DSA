import java.util.HashSet;

public class Recursion {

    static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void printCombo(String str,int i,String combination){
        if (i==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(i);
        String mapping=keypad[currChar-'0'];

        for (int j = 0; j < mapping.length(); j++) {
            printCombo(str,i+1,combination+mapping.charAt(j));

        }
    }


    static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    static int search(int[] arr, int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target<arr[mid]){
            e=mid-1;
        } else if (target>arr[mid]) {
            s=mid+1;
        }
        else {
            return mid;
        }
        return search(arr,target,s,e);

    }

    static void printStringInReverse(String str,int i){
        if(0==i){
            System.out.print(str.charAt(i));
            return ;
        }
        System.out.print(str.charAt(i));
        printStringInReverse(str,--i);
    }

    static void findFirstAndLastOccurance(String str,char target,int i,int first,int last){
        if(str.length()==i){
            System.out.println(first);
            System.out.println(last);
            return ;
        }
        if (str.charAt(i)==target){
            if (first==-1){
                first=i;
            }
            else {
                last=i;
            }
        }
        findFirstAndLastOccurance(str,target,++i,first,last);
    }

    static boolean checkIfArrayIsSorted(int[] arr,int i, boolean isSorted){

        if (arr.length==i){
            return isSorted;
        }
        if(i< arr.length-1 && arr[i]>arr[i+1]){
            //System.out.println(false);
            return false;
        }
        else {
            return  isSorted=checkIfArrayIsSorted(arr,++i,true);
        }

    }

    static String moveAllx(String str,int i,int count,String newStr){
        if (str.length()==i){
            for (int j = count; j >0 ; j--) {
                newStr+='x';
            }
            return newStr;
        }
        if(str.charAt(i)=='x'){
           return moveAllx(str,++i,++count,newStr);
        }
        else {
            newStr += str.charAt(i);
            return moveAllx(str, ++i, count, newStr);
        }
    }

    static void removeDuplicate(String str,int i,String newStr,boolean[] map){
        if (i==str.length()){
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(i)-'a']==true){
            removeDuplicate(str,++i,newStr,map);
        }
        else{
            newStr+=str.charAt(i);
            map[str.charAt(i)-'a']=true;
            removeDuplicate(str,++i,newStr,map);
        }
    }
    static void subSequences(String str, int i,String newString){
        if (i==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(i);

        subSequences(str,i+1,newString+currChar);
        subSequences(str,i+1,newString);
    }

    static void uniqueSubSequences(String str, int i, String newString, HashSet<String> set){
        if (i==str.length()){
            if (set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar=str.charAt(i);
        uniqueSubSequences(str,i+1,newString+currChar, set);
        uniqueSubSequences(str,i+1,newString, set);
    }



    public static void main(String[] args) {
        //System.out.println(fibo(2));
        int[] array = {1,2,3,4,5,6,7} ;
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

        String str="4";
        printCombo(str,0,"");
    }

}
