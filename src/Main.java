import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("¿Son iguales los dos nuemros?");

        Scanner sc = new Scanner(System.in);

        int inumero1 = sc.nextInt();

        int inumero2 = sc.nextInt();

        System.out.println(inumero1 == inumero2 ? "Son iguales chaval" : "No son iguales que bien");
    }
}