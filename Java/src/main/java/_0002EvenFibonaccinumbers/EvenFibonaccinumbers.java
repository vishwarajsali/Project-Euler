package _0002EvenFibonaccinumbers;

/**
 * EvenFibonaccinumbers
 */
public class EvenFibonaccinumbers {

    public static void main(String[] args) {
        System.out.println(evenFibonaccinumbers(4000000));
    }

    public static long evenFibonaccinumbers(int num){
        int[] dict = new int[num];
        int index = 0;
        long sum = 0;
        while(true){
            if(index <= 1){
                dict[++index] = index;
                continue;
            }
            dict[index] = dict[index-1] + dict[index-2];
            if(dict[index] > num) break;
            if(dict[index] %2 == 0) sum += dict[index];
            index++;
        }


        return sum;
    } 
}