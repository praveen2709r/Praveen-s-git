package BasicMath;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=121;
        int ans=reverse(n);
        if(ans==n)
            System.out.println("palindrome");
        else
            System.out.println("not");
    }

    private static int reverse(int n) {
        int ans=CountDigits.countDigit(n);int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+= temp*(int)Math.pow(10,--ans);
            n/=10;
        }return sum;
    }
}
