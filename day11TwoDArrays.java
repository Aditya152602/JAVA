/*import java.util.Scanner;
public class day11TwoDArrays {
     public static void main(String[] args) {

// Que:Taking a matrix as an input and printing its elements.

//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int columns = sc.nextInt();

//        int[] numbers[] = new int[rows][columns];

        // Input
//        for (int i = 0; i < rows; i++) {    // Control Rows
            // Columns
//            for (int j = 0; j < columns; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
        // Outputs
//        for (int i = 0; i < rows; i++) {
//            for(int j=0; j<columns; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

// Que:Take a matrix as input from the user. Search for a given no. x and print the indices at which it occurs.

      Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[] numbers[] = new int[rows][columns];

        // Input
        for (int i = 0; i < rows; i++) {    // Control Rows
                                                
            for (int j = 0; j < columns; j++) { // Control Columns
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                // Compare with x
                if(numbers[i][j] == x){
                    System.out.println("x is found at location (" + i +"," + j + ")");
                }
            }
        }

// Que:For a given matrix of N X M print its transpose.

//      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        //To print transpose
        for (int j=0; j<m ; j++){
            for (int i=0; i<n ; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
// Que:Print the spiral order matrix as output for a given matrix of numbers.
        
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int m = sc.nextInt();

//    int []matrix[] = new int[n][m];

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print spiral order matrix.

        while (rowStart <= rowEnd && colStart <= colEnd){

            //1
            for (int col=colStart; col<=colEnd; col++ ){
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;

            //2
            for (int row=rowStart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd] + " ");
            }

            colEnd--;

            //3
            for (int col=colEnd;col>=colStart;col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for (int row=rowEnd; row>=rowStart; row--){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();

        }
    }
}*/



