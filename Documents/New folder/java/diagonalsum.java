public class diagonalsum{
    public static int dsum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        return sum;
        
    }
    public static void linearsearch(int key,int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("found at:"+i+','+j);
                }
            }
        }
    }
    public static void superiorsearch(int key, int matrix[][]){
        
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}};
        System.out.println(dsum(matrix));
        int key = 9;
        linearsearch(key,matrix);
        int matrix2[][] = {{10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,50}};
    }
}