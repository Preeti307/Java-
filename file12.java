/* Variable argument */
public class file12 {
    static int sum(int ...arr){
        // arr is available here as int[] arr
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    };

    static float sum1(float ...arr){
        // arr is available here as float[] arr
        float result = 0.0f;
        for(float a : arr){
            result += a;
        }
        return result;
    };

    public static void main(String[] args){
        // For integer values
        System.out.println("The sum of 1 and 3 is : " + sum(1,3));
        System.out.println("The sum of 1,2 and 3 is : " + sum(1,2,3));
        System.out.println("The sum of 1,2,4 and 3 is : " + sum(1,2,4,3));
        System.out.println("The sum of 1,2,4,5 and 3 is : " + sum(1,2,4,5,3));
        // For float values
        System.out.println("The sum of 1.5 and 3.5 is : " + sum1(1.5f,3.5f));
        System.out.println("The sum of 1.5,2.5,4.5,5.5 and 3.5 is : " + sum1(1.5f,2.5f,4.5f,5.5f,3.5f));
    }
}
