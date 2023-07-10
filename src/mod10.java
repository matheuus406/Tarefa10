import java.util.Scanner;

public class mod10 {
    public static void main(String args[]) {
        Double soma = Double.valueOf(0);
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            Double nota = s.nextDouble();
            soma += nota;
        }
        double media = soma/4;
        if (media >= 7) {
            System.out.println("Aprovado, média: " + media);
        } else if (media >= 5) {
            System.out.println("Recuperção, média: " + media);
        } else System.out.println("Reprovado, média: " + media);
    }
}
