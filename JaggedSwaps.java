import java.util.*;
public class JaggedSwaps{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                min=Math.min(min,a[i]);
            }
            if (a[0]!=min){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
        
        
    }
}
