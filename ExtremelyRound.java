import java.util.*;
public class ExtremelyRound{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int k = String.valueOf(n).length();
                int ans=0;
                int z = String.valueOf(n).charAt(0)-'0';
                     ans+= (k-1)*9 + z;
                System.out.println(ans);
            }
    }
}
