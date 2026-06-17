import java.util.*;
public class ArrayColouring{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[]= new int [n];
            int odd=0;
            int even=0;
            boolean ispo=true;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0) even++;
                else odd++;
            }
            if(odd%2==0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
