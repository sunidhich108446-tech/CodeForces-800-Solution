import java.util.*;
public class UnitedweStand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int mn = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                mn =Math.min(mn, a[i]);
            }
            ArrayList<Integer> b = new ArrayList <>();
            ArrayList<Integer> c = new ArrayList<>();
            boolean isEqual= true;
            for(int i=1;i<n;i++){
                if(a[i]!=a[i-1]) {
                    isEqual=false;
                    break;
                }
            }
            if(isEqual){
                System.out.println(-1);
                continue;
            }
            else{
                for(int i=0;i<n;i++){
                    if(a[i]!=mn){
                        c.add(a[i]);
                    }
                    else{
                        b.add(a[i]);
                    }
                }
                System.out.println(b.size() + " " + c.size());
                for(int i=0;i<b.size();i++){
                    System.out.print(b.get(i) + " ");
                }
                System.out.println();
                for(int i=0;i<c.size();i++){
                    System.out.print(c.get(i) + " ");
                }
            }
        }
    }
}
