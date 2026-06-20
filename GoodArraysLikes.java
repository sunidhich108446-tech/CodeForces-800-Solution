import java.util.*;
public class GoodArraysLikes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            int count=0;
            for(int i=1;i<n;i++){
                if((a[i-1]%2==0 && a[i]%2==0) || (a[i-1]%2!=0 && a[i]%2!=0)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
