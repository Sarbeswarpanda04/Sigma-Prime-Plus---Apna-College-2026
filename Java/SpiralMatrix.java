import java.util.*;
public class SpiralMatrix {
    public static void Printspiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol ; j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow ; i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol ; j--){
                if(startCol == endCol){
                    return ;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1 ; i++){
                if(startRow == endRow){
                    return;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        int arr[][] = new int[n][m];

        //input
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Printspiral(arr);
        
        sc.close();
    }
}
