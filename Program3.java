import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[1000];
            a[1]=1;
            a[0]=1;
            for(int i=2;i<100;i++){
                for(int j=2;j<100;j++){
                if(j%2!=0){

                   a[i]=j;
                    i++;}
                else    
                    continue;
            }
        }
              for(int i=0;i<n;i++){
                System.out.println(a[i]);
    }
}
}
