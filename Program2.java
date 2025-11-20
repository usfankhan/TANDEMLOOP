import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[50];
        int num=0;
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                a[num]=i;
            }
            else{
                continue;
            }
            num++;
          }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
    }
}
}
