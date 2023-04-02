public class task
{
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;
        int a[][] = {
                {3, 4, 9}, {4, 6, 0}, {2, 9, 11} };
        rows = a.length;
        cols = a[0].length;
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum"+(i+1)+"row"+sumRow);
        }
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + a[j][i];
            }
            System.out.println("Sum"+(i+1)+"column"+sumCol);
        }
        int sumDiagonal1=0;
        for (int i = 0, j =0; i< rows && j < cols; i++, j++) {
                sumDiagonal1= sumDiagonal1 + a[i][j];
            }
        int sumDiagonal2=0;
        for (int i=0,j=cols-1 ; i<rows && j>=0 ; i++, j--) {
            sumDiagonal2= sumDiagonal2 + a[i][j];
        }
        System.out.println("diagonal1="+sumDiagonal1+",diagonal2="+ sumDiagonal2 );
        System.out.println("diagonal1+diagonal2="+ (sumDiagonal1+ sumDiagonal2) );
    }
}


