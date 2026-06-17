import java.util.*;
public class DoremyPaint{
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int t= sc.nextInt();
         while(t-->0){
             int n = sc.nextInt();
             int a[]= new int[n];
             HashMap<Integer,Integer> map = new HashMap<>();
             for(int i=0;i<n;i++){
                 a[i]=sc.nextInt();
                 map.put(a[i], map.getOrDefault(a[i], 0)+1);
             }
             ArrayList<Integer> freq= new ArrayList<>(map.values());
             if(map.size()==1) {
                 System.out.println("YES");
                 continue;
             }
            else if(map.size()>2){
                    System.out.println("NO");
                    continue;
             }
             else{
                 if(Math.abs(freq.get(0)-freq.get(1))<=1){
                     System.out.println("YES");
                     continue;
                 }
                 else {
                     System.out.println("NO");
                     continue;
                 }
                 
             }
             
         }
    }
}
