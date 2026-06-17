import java.util.*;

public class  UnitArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int countneg = 0;

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == -1) countneg++;
            }

            int countpos = n - countneg;
            int sum = countpos - countneg;
            int op = 0;
            while(sum < 0){
                sum += 2;      
                countneg--;    
                op++;
            }
            if(countneg % 2 != 0){
                op++;
            }
            System.out.println(op);
        }
    }
}
