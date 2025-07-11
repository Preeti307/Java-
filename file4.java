/* String operation */
public class file4 {
    public static void main(String[] args) {
        String sc = "Preeti";
        String sd = "    Khatri    ";

        int sc1 = sc.length();
        // System.out.println(sc.length());
        System.out.println("Length of string = " + sc1);

        String sc2 = sc.toUpperCase();
        System.out.println("For upper case = " + sc2);

        String sc3 = sc.toLowerCase();
        System.out.println("For lower case = " + sc3);

        String sc4 = sd.trim();
        System.out.println("For trim = " + sc4);

        String sc5 = sc.substring(3);
        System.out.println("For substring = " + sc5);

        String sc6 = sc.substring(3,5);
        System.out.println("For substring = " + sc6);

        String sc7 = sc.replace('P','k');
        System.out.println("For replace = " + sc7);

        String sc8 = sc.replace("eti","tty");
        System.out.println("For replace = " + sc8);

        boolean sc9 = sc.startsWith("Pee");
        System.out.println("For startWith = " + sc9);

        boolean sc10 = sc.endsWith("ti");
        System.out.println("For endstWith = " + sc10);

        char sc11 = sc.charAt(2);
        System.out.println("For charAt = " + sc11);

        int sc12 = sc.indexOf("re");
        System.out.println("For indexOf = " + sc12);

        int sc13 = sc.indexOf("e",3);
        System.out.println("For indexOf = " + sc13);

        boolean sc14 = sc.equals("preeti");
        System.out.println("For equals = " + sc14);

        boolean sc15 = sc.equalsIgnoreCase("prEeti");
        System.out.println("For equalsIgnoreCase = " + sc15);

        System.out.println("This is all String cases\n");
        System.out.println("This is \t all String cases");
        System.out.println("This is all \"String\" cases\n");

    }
}
