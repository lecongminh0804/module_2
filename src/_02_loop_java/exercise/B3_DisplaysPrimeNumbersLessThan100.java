package _02_loop_java.exercise;
public class B3_DisplaysPrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 100){
            if(isPrime(number)) {
                System.out.print(number + " ");
            }
            number ++;
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
