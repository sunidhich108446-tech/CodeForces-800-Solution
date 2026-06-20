import java.util.*;
public class Serval{
    public static int gcd(int a, int b){
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int [n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            boolean ispossible=false;
            for(int i=0;i<n-1;i++){
                for(int j=i+1; j<n;j++){
                    if(gcd(a[i],a[j])<=2) {
                        ispossible = true;
                        break;
                    }
                }
                if(ispossible) break;
            }
            if(ispossible){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}