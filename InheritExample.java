class Bapak {
    int a;
    int b;

    void show_variable() {
        System.out.println("Nilai a="+ a);
        System.out.println("Nilai b="+ b);
    }
}

class Anak extends Bapak {
    int c;
    int b;
    int a;
    void show_variable() {
        System.out.println("Nilai a="+ super.a);
        System.out.println("Nilai b="+ super.b);
        System.out.println("Nilai c="+ c);
    }
    
}

public class InheritExample {
    public static void main(String[] args) {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();

        objectBapak.a=1;
        objectBapak.b=2;
        System.out.println("Object Bapak (Superclass dari Bapak) :");

        objectBapak.show_variable();
        objectAnak.c=5;
        System.out.println("Object Anak (Superclass dari Bapak) :");
        objectAnak.show_variable();

    }
} 