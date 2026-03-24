public class Zad9 {

    public static boolean isSquareMagic(int[][] square) {
        int firstRowSum = 0;

        for (int i = 0; i < square.length; i++) {
            firstRowSum += square[0][i];
        }

        //check rows and columns
        int rowSum;
        int colSum;
        for (int i = 0; i < square.length; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j = 0; j < square.length; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != firstRowSum || colSum != firstRowSum) {
                return false;
            }
        }

        //check diagonals
        int tmpDiagonalSum1 = 0;
        int tmpDiagonalSum2 = 0;
        for (int i = 0; i < square.length; i++) {
            tmpDiagonalSum1 += square[i][i];
            tmpDiagonalSum2 += square[i][square.length - 1 - i];
        }
        if (tmpDiagonalSum1 != firstRowSum || tmpDiagonalSum2 != firstRowSum) {
            return false;
        }

        return true;
    }


    static void main(String[] args) {
        System.out.println(isSquareMagic(new int[][] {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        }));


    }
}
