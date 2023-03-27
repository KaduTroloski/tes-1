import java.util.Scanner;

public class apenas_numero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número:");
        while(!sc.hasNextInt()){
            System.out.println("Digite algo válido");
            sc.next();
        }
        num = sc.nextInt();
        System.out.println("O número é:"+num);
        sc.close();
    }
}
