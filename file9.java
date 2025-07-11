/* Problem 1 */
// public class file9 {
//     public static void main(String[] args){
//         float[] num = {10.1f,20.1f,30.1f,40.1f,50.1f};
//         float sum=0;
//         for(int i=0; i<num.length; i++){
//             sum = sum + num[i];
//         }
//         System.out.println("The sum of all elements =" + sum);
//     }
// }


/* Problem 2 */
// public class file9 {
//     public static void main(String[] args){
//         float[] num = {10.1f,20.1f,30.1f,40.1f,50.1f};
//         float find = 30.12f;
//         boolean isInArray = false;
//         for(int i=0; i<num.length; i++){
//             if(find == num[i]){
//                 isInArray = true;
//                 break;
//             }
//         }
//         if(isInArray){
//         System.out.println("The value is present in the array.");
//         }
//         else{
//             System.out.println("The value is not present in the array.");
//         }
//     }
// }


/* Problem 3 */
public class file9 {
    public static void main(String[] args) {
        // [2] = Rows
        // [3] = columns
        int[][] arr = new int[2][3];
        arr[0][0] = 101;
        arr[0][1] = 102;
        arr[0][2] = 103;
        arr[1][0] = 201;
        arr[1][1] = 202;
        arr[1][2] = 203;
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 101;
        arr1[0][1] = 102;
        arr1[0][2] = 103;
        arr1[1][0] = 201;
        arr1[1][1] = 202;
        arr1[1][2] = 203;
        System.out.println("Length of array = " + arr.length);
        System.out.println("Length of array 1 = " + arr1.length);

        int sum =0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum = sum + arr[i][j] + arr1[i][j];
                System.out.print(sum);
                System.out.print(" ");
                sum = 0;
            }
            System.out.println("");
        }
    }
}