package Test;

public class Main {
    public static void main(String[] args) {
        int temp = 2;
        temp >>= 1;  //?
        int a[] = new int[]{20, 15, 20, 14, 7, 8, 60};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " FF ");
        }
        System.out.println(temp);
    }
}
