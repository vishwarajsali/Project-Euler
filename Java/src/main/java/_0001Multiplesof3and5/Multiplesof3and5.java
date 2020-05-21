package _0001Multiplesof3and5;

/**
 * Multiplesof3and5
 */
public class Multiplesof3and5 {
    public static void main(String[] args) {
        System.out.println(multiplesof3and5(1000000));
        System.out.println(multiplesof3and51(10));

    }

    public static long multiplesof3and5(int num){
        long sum =0;
        for (int i = 1; i < num; i++) {
            if(i %3 == 0 || i% 5 == 0) sum+=i;
        }

        return sum;
    }

    public static long multiplesof3and51(int n){
        
        long s = sumOfMulti(n-1,3) ;
         s += sumOfMulti(n-1,5);
        return s;
    }

    public static long sumOfMulti(int n, int k){
        long d = (long)Math.floor(n / k);
        return (d*(k + n))/2;
    }

}