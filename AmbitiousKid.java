import java.util.*;
public class AmbitiousKid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int min=Math.abs(a[0]);
        for(int i=1;i<n;i++){
            if(Math.abs(a[i])<min){
                min=Math.abs(a[i]);
            }
        }
        System.out.println(min);
    }
}
