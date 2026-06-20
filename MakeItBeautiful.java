import java.util.*;
public class MakeItBeautiful{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            boolean issame=true;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                if(i!=0){
                    if(a[i-1]!=a[i]){
                        issame =false;
                    }
                }
            }
            if(issame){
                System.out.println("NO");
                continue;
            }
            Arrays.sort(a);
            System.out.println("YES");
            System.out.print(a[n-1]+ " ");
            for(int i=0;i<n-1;i++){
                System.out.print(a[i] + " ");
            }
            
        }
    }
}
