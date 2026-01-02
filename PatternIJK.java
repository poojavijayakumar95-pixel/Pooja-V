package controlstatement;

public class PatternIJK {

    public static void main(String[] args) {
        int k = 5;

        for (int i = k; i >= 1; i--) {
            for (int j = k; j >= 1; j--) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            
            System.out.println();
        }
    }
}


