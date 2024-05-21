public class PatternPrograms {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int c = i <= n ? i : n - (i - n);
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //need to fix
    static void pattern6(int n) {
        for (int i = 0; i < 2 * n; i++) {
            n=2*n;
            int space = i <= n ? i : 2 * n - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            int star = n - space;
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int r = 1; r <= n; r++) {

            for (int s = 0; s < n - r; s++) {
                System.out.print("  ");
            }
            for (int c = r; c >= 1; c--) {
                System.out.print(c + " ");
            }
            for (int c = 2; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int r = 1; r <= 2*n; r++) {
            int vc=r>n?2*n-r:r;
            for (int s = 0; s < n - vc; s++) {
                System.out.print("  ");
            }
            for (int c = vc; c >= 1; c--) {
                System.out.print(c + " ");
            }
            for (int c = 2; c <= vc; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }




}