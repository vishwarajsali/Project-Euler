package _0001Multiplesof3and5;

/**
 * Multiplesof3and5
 */
public class Multiplesof3and5 {
    public static void main(String[] args) {
        System.out.println(multiplesof3and5(1000));
    }

    public static long multiplesof3and5(int num){
        long sum =0;
        for (int i = 1; i < num; i++) {
            if(i %3 == 0 || i% 5 == 0) sum+=i;
        }

        return sum;
    }
}