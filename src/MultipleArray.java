
public class MultipleArray {

    public static void main(String[] args) {
        int[][] twoDimension =  {{2, 4, 6}, {1, 3, 5, 7, 9, 11, 13}, {0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        for(int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[i].length; j++) {
                System.out.print(twoDimension[i][j] + " ");
            }
        }
    }
}
