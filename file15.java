/* Problem 1 */
//class Employee{
//    int salary;
//    String name;
//    public void getsalary(int a){
//        System.out.println(a);
//    }
//    public String setname(String b){
//        return b;
//    }
//    public char favorite(char ch){
//        return ch;
//    }
//}
//
//public class file15{
//    public static void main(String[] args){
//
//        Employee E1 = new Employee();
//        E1.getsalary(1000000);
//        System.out.println(E1.setname("Ram"));
//        System.out.println(E1.favorite('s'));
//    }
//}

/* Problem 2 */
//class CellPhone{
//    public void putdata(){
//        System.out.println("ringing.....");
//    }
//    public void getdata(){
//        System.out.println("vibrating.....");
//    }
//}
//
//public class file15{
//    public static void main(String[] args){
//        CellPhone phone = new CellPhone();
//        phone.putdata();
//        phone.getdata();
//    }
//}

/* Problem 3 */
class Formulas{
    int side;
    float total;
    public void area(){
        total = side * side;
        System.out.println(total);
    }
    public void perimeterOfCircle(){
        total = 2 * 3.14f * side;
//        System.out.println(total);
        System.out.printf("%.2f\n" , total);
    }
    public void perimeterOfRectangle(int l , int w){
        total = 2 * (l+w);
        System.out.println(total);
    }
}

public class file15{
    public static void main(String[] args){
        Formulas f1 = new Formulas();
        f1.side = 5;
        f1.area();
        f1.perimeterOfCircle();
        f1.perimeterOfRectangle(3,6);
    }
}