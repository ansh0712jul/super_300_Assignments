import java.util.Scanner;

public class Leetcode_pallindrome {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int x) {
        int sum=0;
        int mul=10;
        int k=x;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            sum=sum*mul+rem;   
        }
        if(sum<0 || sum!=k) return false;
        else return true;    
    }
    
}
