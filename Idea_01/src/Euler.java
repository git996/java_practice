import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Euler {

    public int problem1(int number){
        int sum = 0;
        for (int i  = 0; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public int problem2(int limit){

        List <Integer> starters = new ArrayList <>();
        starters.add(1);
        starters.add(2);
        int fib = 0;
        int evenSum = 2;
        for (int i = 2; fib < limit; i++){
            fib = starters.get(i - 2) + starters.get(i - 1);
            if(fib < limit){
                starters.add(fib);
                if(fib % 2 == 0){
                    evenSum = evenSum  + fib;
                }
            }
        }
        System.out.println(evenSum);
        return evenSum;
    }

    public long problem_3(long largeNumber){
        long largestFactor = 0;
        long n = largeNumber;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n/i;
            }
        }
        System.out.println((factors.get(factors.size() -1)));
        return 1;
    }

    public int problem_4(){
        int [] range = {1, 99};
        int counterUp = range[0];
        int counterDown = range[1];
        int product = 0;
        List <Integer> prods = new ArrayList <>();
        while(counterUp != counterDown){

             product = counterUp * counterDown;
            System.out.println(product);
            String reversed = new StringBuilder(Integer.toString(product)).reverse().toString();
             if(Integer.toString(product) == reversed){
                 System.out.println(product);
                 prods.add(product);

             }
             counterDown-=1;
             counterUp +=1;

        }
        System.out.println(prods.toString());
        return 1;

    }



    public static void main(String[] args) {
        System.out.println("Begin Euler Project..");
        Euler euler = new Euler();

//        euler.problem1(1000);
//        euler.problem2(4000000);
//        euler.problem_3(600851475143l);
          euler.problem_4();
    }
}
