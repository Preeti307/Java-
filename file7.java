/* Array */
public class file7 {
    public static void main(String[] args) {
        //There are there types of array declaration.
        // first
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // second
        int [] arr1;
        arr1 = new int[2];
        arr1[0] = 30;
        arr1[1] = 40;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        //third
        int[] arr2 = {50,60};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        // floating and char array
        float[] marks = {90.5f,98.6F};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println("The length of array = " + marks.length);

        char[] character = {'P','S','T','M'};
        System.out.println(character[0]);
        System.out.println(character[1]);
        System.out.println("The length of array = " + character.length);

        String[] Name = {"Preeti","Shivam","Tonu","Mohit"};
        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println("The length of array = " + Name.length);

        for(int i=0; i<Name.length; i++){
            System.out.println(Name[i]);
        }

        System.out.println("In reverse order:");
        for(int i=Name.length-1; i>=0; i--){
            System.out.println(Name[i]);
        }
    }
}
