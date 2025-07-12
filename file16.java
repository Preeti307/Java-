/* getter and setter */
class GetSet{
    private int radius ;
    private float total;

    public void set(int a){
        radius  = a;
    }
    public float get(){
        total = 2 * 3.14f * radius;
        return total;
    }
}
public class file16 {
    public static void main(String[] args){
        GetSet formula = new GetSet();
        formula.set(5);
        System.out.println(formula.get());
    }
}
