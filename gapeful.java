import java.util.Scanner;

class gapeful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int length = s1.length();
        
        if (length < 3) {
            System.out.println("No");
            return;
        }
        
        String s2 = s1.charAt(0) + "" + s1.charAt(length - 1);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        
        if (n1 % n2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
