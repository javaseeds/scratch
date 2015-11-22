package funk.shane.hackerrank.java;

import java.util.*;

/**
 * Created by Shane on 11/10/2015.
 */
public class HashSet1 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;

        final Set<Pair> pairs = new HashSet<>();

        for(int i = 0; i < t; i++) {
            if(pairs.add(new Pair<>(sc.next(), sc.next()))) {
                count++;
            }

            System.out.println(count);
        }
    }
}

class Pair<T> {
        T left;
        T right;

        public T getLeft() {
            return left;
        }

        public void setLeft(T left) {
            this.left = left;
        }

        public T getRight() {
            return right;
        }

        public void setRight(T right) {
            this.right = right;
        }

        Pair(T left, T right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?> pair = (Pair<?>) o;
            return Objects.equals(left, pair.left) &&
                Objects.equals(right, pair.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
}
