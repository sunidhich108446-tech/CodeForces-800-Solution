import java.util.*;
public class oneandtwo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int left=0,right=1;
            int count=0;
            while(right<n){
                if((a[left]%2==0 && a[right]%2==0) || (a[right]%2!=0 && a[left]%2!=0)){
                    count++;
                }
                left++;
                right++;
            }
            System.out.println(count);
        }
    }
}
