import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<Integer> A = Set.of(1, 3, 5);
    static Set<Integer> B = Set.of(3, 5, 7);
    static Set<Integer> C = Set.of(5, 7, 9);


    private static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    private static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    private static Set<Integer> diff(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static void main(String[] args) {

        //Vereinigungsmenge
        System.out.println("Vereinigungsmenge: ");
        System.out.println("AuB = " + union(A, B));
        System.out.println("AuC = " + union(A, C));
        System.out.println("BuC = " + union(B, C));
        System.out.println();

        //Schnittmenge
        System.out.println("Schnittmenge:");
        System.out.println("AnB = " + intersection(A, B));
        System.out.println("AnC = " + intersection(A, C));
        System.out.println("BnC = " + intersection(B, C));
        System.out.println();

        //Differenzmenge
        System.out.println("Differenzmenge: ");
        System.out.println("A/B = " + diff(A, B));
        System.out.println("A/C = " + diff(A, C));
        System.out.println("B/A = " + diff(B, A));
        System.out.println("B/C = " + diff(B, C));
        System.out.println("C/A = " + diff(C, A));
        System.out.println("C/B = " + diff(C, B));
        System.out.println();

        //Union
        System.out.println("Union");
        System.out.println("AuBuC = " + union(A, union(B, C)));
        System.out.println();

        //Beispiel
        System.out.println("Beispiel: ");
        System.out.println("Au(BnC) " + union(A, intersection(B,C)));

    }
}