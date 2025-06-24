//Pattern K
public class PatternK {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0, j, k = n / 2; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || j == k)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }
            if (i < n / 2)
                k--;
            else
                k++;
            System.out.println();
        }
    }
}

