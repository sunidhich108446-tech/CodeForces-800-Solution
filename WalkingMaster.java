import java.util.*;
public class WalkingMaster{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x1= sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            long count=0;
            if(y2<y1){
                System.out.println(-1);
                continue;
            }
            else{
               count+=y2-y1;
               x1+=count;
               if(x2-x1>0){
                   System.out.println(-1);
                   continue;
               }
               else{
                   count+= x1-x2;
               }
            }
            System.out.println(count);
        }
    }
}