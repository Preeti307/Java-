abstract class parent{
    public void firstline(){
        System.out.println("About animal...");
    }
    abstract void sound();
    abstract void name();
}

class child extends parent{
    void name(){
        System.out.println("Name = Dog");
    }
    void sound(){
        System.out.println("Sound = Bark");
    }
}

abstract class child2 extends parent{
    public void secondline(){
        System.out.println("About human...");
    }
    public void putdata(){
        System.out.println("Name = Tanishk soni");
        System.out.println("Sound = Soft");
    }
}

class subchild extends child2{
    void name(){
        System.out.println("Name = Cat");
    }
    void sound(){
        System.out.println("Sound = Meaun");
    }
}

public class file30 {
    public static void main(String[]args){
        //parent p1 = new parent(); ---> error
        //child2 c1 = new child2(); ---> error
        child c1 = new child();
        c1.firstline();
        c1.name();
        c1.sound();
        subchild s1 = new subchild();
        s1.firstline();
        s1.name();
        s1.sound();
        s1.secondline();
        s1.putdata();
    }
}
