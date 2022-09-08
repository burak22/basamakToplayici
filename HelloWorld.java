import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tempNumber = a;
        tempNumber = a;
        int sum = a%10;
        while(tempNumber!=0){
            tempNumber/=10;
            sum+=tempNumber%10;
        }
        System.out.println(a + " Sayısının basamaklar toplamı = " + sum);
        sc.close();
    }            
}