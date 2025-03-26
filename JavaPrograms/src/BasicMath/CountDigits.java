package BasicMath;

public class CountDigits {
    public static void main(String[] args) {
        int n=-23432;
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n) {
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }return count;
    }
}
