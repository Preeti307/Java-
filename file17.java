/* constructor */
class Student{
    private String sector , Hod;
    private int year;
    public Student(){
        sector = "b.tech";
    }
    public Student(int y , String n){
        sector = "b.tech";
        year = y;
        Hod = n;
    }
    public void getdata(){
        System.out.println(sector + "\n" + year + "year" + "\n" +  Hod);
    }
}

public class file17 {
    public static void main(String[] args){
        Student preeti = new Student(1 , "Garima");
        preeti.getdata();
    }
}
