import java.util.*;
public class SequenceGame{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int b[] = new int[n];
            ArrayList <Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                   ans.add(b[i]);
                 if(b[i+1]<b[i]){
                     ans.add(1);
                 }
            }
            ans.add(b[n-1]);
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i) + " ");
            }
            
        }
    }
}