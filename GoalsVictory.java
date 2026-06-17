import java.util.*;
public class GoalsVictory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum=0;
            int a[] = new int[n-1];
            for(int i=0;i<n-1;i++){
                a[i]= sc.nextInt();
                sum+=a[i];
            }
            int ans = -(sum);
            System.out.println(ans);
        }
    }
}
