import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> A = List.of(1, 3, 5);
        List<Integer> B = List.of(3, 5, 7);
        List<Integer> C = List.of(5, 7, 9);

        //Vereinigungsmenge
        System.out.println("Vereinigungsmenge: ");
        Set<Integer> v = new HashSet<>(A);
        v.addAll(B);
        System.out.println("AuB = " + v);
        v.clear();
        v.addAll(A);
        v.addAll(C);
        System.out.println("AuC = " + v);
        v.clear();
        v.addAll(B);
        v.addAll(C);
        System.out.println("BuC = " + v);
        System.out.println();

        //Schnittmenge
        System.out.println("Schnittmenge:");
        Set<Integer> s = new HashSet<>(A);
        s.retainAll(B);
        System.out.println("AnB = " + s);
        s.clear();
        s.addAll(A);
        s.retainAll(C);
        System.out.println("AnC = " + s);
        s.clear();
        s.addAll(B);
        s.retainAll(C);
        System.out.println("BnC = " + s);
        System.out.println();

        //Differenzmenge
        System.out.println("Differenzmenge: ");
        Set<Integer> d = new HashSet<>(A);
        d.removeAll(B);
        System.out.println("A/B = " + d);
        d.clear();
        d.addAll(A);
        d.removeAll(C);
        System.out.println("A/C = " + d);
        d.clear();
        d.addAll(B);
        d.removeAll(A);
        System.out.println("B/A = " + d);
        d.clear();
        d.addAll(B);
        d.removeAll(C);
        System.out.println("B/C = " + d);
        d.clear();
        d.addAll(C);
        d.removeAll(A);
        System.out.println("C/A = " + d);
        d.clear();
        d.addAll(C);
        d.removeAll(B);
        System.out.println("C/B = " + d);
        System.out.println();

        //Union
        System.out.println("Union");
        Set<Integer> u = new HashSet<>(A);
        u.addAll(B);
        u.addAll(C);
        System.out.println("AuBuC = " + u);
        System.out.println();

        //Beispiel
        System.out.println("Beispiel: ");
        Set<Integer> b = new HashSet<>(B);
        b.retainAll(C);
        Set<Integer> temp = new HashSet<>(A);
        temp.addAll(b);
        System.out.println("Au(BnC) " + temp);

    }
}