import java.util.*;
public class CoverInWater{
    public static void main(String[]args){
        Scanner  sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s  = sc.next();
            boolean isthere =false;
            for(int i =0;i<n-2;i++){
                if(s.charAt(i)=='.' && s.charAt(i+1) =='.' && s.charAt(i+2)=='.'){
                    isthere =true;
                    break;
                }
            }
            if(isthere){
                System.out.println(2);
                continue;
            }
            int count =0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.') count++;
            }
            System.out.println(count);
        }
    }
}
