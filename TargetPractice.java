import java.util.*;
public class TargetPractice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char mat[][]= new char[10][10];
            for(int i = 0; i < 10; i++){
                String s = sc.next();
            for(int j = 0; j < 10; j++){
                mat[i][j] = s.charAt(j);
                }
              }
            int ans=0;
            for(int i=0;i<=9;i++){
                for(int j=0;j<=9;j++){
                    if(mat[i][j]=='X'){
                        if(i==0 || i==9||j==0||j==9){
                            ans+=1;
                        }
                        else if(i==1 || i==8 || j==1 || j==8){
                            ans+=2;
                        }
                        else if(i==2 || i==7 || j==2 || j==7){
                            ans+=3;
                        } else if(i==3 || i==6|| j==3|| j==6){
                            ans+=4;
                        }
                        else{
                            ans +=5;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}