public class problems2darray{
    public static void find7(int number, int matrix[][]){
        int foundtimes = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(number == matrix[i][j]){
                    foundtimes++;
                }
            }
        }
        System.out.println(foundtimes);
    }
    public static int sum2nd(int matrix[][]){
        int sum = 0;
        for(int j = 0;j<matrix[0].length;j++){
            sum = sum + matrix[1][j];
        }
        return sum;
    }
    public static void swap(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                int temp;
                // temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp;
                System.out.print(matrix[i][j]);
                System.out.print(' ');

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //problem 1: finding number of sevens
        int matrix[][] = {{4,7,8},{8,8,7}};
        int number = 7;
        find7(number,matrix);

        //problem 2: sum of second row
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("the sum is:" + sum2nd(nums));

        //problem 3: swap/transpose in a matrix
        swap(nums);
        //naya matrix bnaya hai jisme elements as transpose save krdiye
    }
}