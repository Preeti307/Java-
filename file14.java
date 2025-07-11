/* create a class and also create a method into a class */
class student{
    String name;
    int roll_no;
    float marks;
    char fav;
     public void print_details(){
        System.out.println("Name = " + name+ "\nRoll_number = " + roll_no+ "\nMarks = " + marks+ "\nfavorite_char = " + fav);
    }
//    void print_details(){
//        System.out.println("Name = " + name+ "\nRoll_number = " + roll_no+ "\nMarks = " + marks+ "\nfav_char = " + fav);
//    }
}

public class file14{
    public static void main(String[] args){
        // student 1
        student p1 = new student();
        p1.roll_no = 123456789;
        p1.marks = 95.8f;
        p1.fav = 'S';
        p1.print_details();
        // student 2
        student s1 = new student();
        s1.name  = "Shivam";
        s1.roll_no = 987654321;
        s1.marks = 95;
        s1.fav = 'P';
        s1.print_details();
    }
}