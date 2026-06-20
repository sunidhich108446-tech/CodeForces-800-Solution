import java.util.*;
public class DontTryToCount{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int ans=0;
            boolean istrue=false;
            for(int i=0;i<=6;i++){
                if(x.contains(s)){
                    ans=i;
                    istrue=true;
                    break;
                }
                x=x+x;
            }
            if(istrue){
                System.out.println(ans);
            } else{
                System.out.println(-1);
            }
        }
    }
}