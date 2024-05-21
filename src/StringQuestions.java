public class StringQuestions {
    public static void main(String[] args) {
        //String str="WNEENESENNN";
        //shortestPath(str);

        // String[] fruits={"apple","mango", "banana"};
        //largerstString(fruits);
        // String name="prajwal sharma";
        //toUpperCase(name);
        String s ="a";
        String t="ab";

        //String longString = "aaabbccd";
        //System.out.println(longString.indexOf('x'));

        //stringCompression(longString);

    }
    static boolean isAnagram(String s, String t) { //need imporvement
        int n=s.length();

        for(int i=0;i<n;i++){
            if((s.indexOf(t.charAt(i))==-1 || t.indexOf(s.charAt(i))==-1) || t.length()==n){
                return false;
            }
        }
        return true;
    }

    static void stringCompression(String str) {
        String compStr = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            compStr += str.charAt(i);
            if (count > 1) {
                compStr += count;
            }
        }
        System.out.println(compStr);
    }

    static void toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.toUpperCase().charAt(0);
        sb.append(ch);
        int n = str.length();
        for (int i = 1; i < n; i++) {

            if (str.charAt(i) == ' ' && i < n - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    static void largerstString(String[] str) {
        String largest = str[0];

        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    static void shortestPath(String str) {
        int n = str.length();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'W') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2)));
    }
}
