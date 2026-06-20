import java.util.*;
public class Desorting{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;;
            boolean issorted =true;
            for(int i=0;i<n-1;i++){
                 if(a[i]>a[i+1]){
                     issorted=false;
                 }
            }
            if(!issorted){
                System.out.println(0);
                continue;
            }
            else{
                for(int i=1;i<n;i++){
                    min=Math.min(min, a[i]-a[i-1]);
                }
            }
        int x=min/2;
        System.out.println(x+1);
            
        }
    }
}