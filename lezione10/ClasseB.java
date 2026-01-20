package lezione10;

public class ClasseB extends ClasseA {
    public void m2() {
        System.out.println(" ClasseB->m2 () ");
    }

    public void m3(ClasseA a) {
        a.m1();
    }

    public void m3(ClasseB b) {
        b.m2();
    }

    public void m4(ClasseB b) {
        System.out.println(" ClasseB->m4 () ");
    }
}
