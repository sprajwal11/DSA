public class BitwiseMath {
    public static void main(String[] args) {
//        int n = 95;
//        System.out.println(isOdd(n));
//        int[] arr = {2, 3, 3, 4, 2, 6, 4};
//        System.out.println(findUnique(arr));
       // int a=0x1111;
        //System.out.println(a);
       // System.out.println(6>>1);
        System.out.println(getIthBit(10,3));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));

    }

    private static int findUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    static int getIthBit(int n, int i){

        int bitMask=1<<i;
        if ((n & bitMask)==0){
            return 0;
        }
        return 1;
    }

    static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n &  bitMask;
    }

    static int updateIthBit(int n, int i, int newBit){
        if (newBit==0){
            return clearIthBit(n,i);
        }
        else
            return setIthBit(n,i);
    }


}
