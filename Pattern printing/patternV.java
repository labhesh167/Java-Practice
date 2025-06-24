//Pattern V
public class patternV {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n * 2 - 1; j++) {
                
                if (j == i || j == 2 * n - 2 - i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


