import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int enbuyuk=0,bos=0,ebob=1,ekok=1;

        System.out.print("n1 : ");
        int n1 = input.nextInt();
        System.out.print("n2 : ");
        int n2 = input.nextInt();

        if (n1 < n2){
            bos = n1;
            n1 = n2;
            n1 = bos;
        }

        for (int i=1;i <= n1;i++){
            if (n1 %i== 0 && n2 %i== 0){
                ebob = i;
            }
        }
        System.out.println("EBOB : "+ebob);

        for (int k=1;k <= n1;k++){
            ekok = (n1*n2)/ebob;
        }
        System.out.println("EKOK : "+ekok);
    }
}
