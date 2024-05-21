public class RecursionAdv {

    static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPath(i + 1, j, n, m);
        int rightPaths = countPath(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    static void printAllPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);
            printAllPermutations(newStr, permutation + currChar);

        }
    }

    static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int vertPlacement = placeTiles(n - m, m);
        int horPlacements = placeTiles(n - 1, m);
        return horPlacements + vertPlacement;
    }

    public static void main(String[] args) {

        //    printAllPermutations("abc","");

        //  System.out.println(countPath(0,0,3,3));

        System.out.println(placeTiles(4, 8));

    }
}
