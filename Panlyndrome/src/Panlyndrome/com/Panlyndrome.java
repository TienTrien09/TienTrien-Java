package Panlyndrome.com;


public class Panlyndrome {

    public static boolean Panlyndrome(String s) {

        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Panlyndrome("madam"));  // true
        System.out.println(Panlyndrome("radar"));  // true
        System.out.println(Panlyndrome("hello"));  // false
    }
}