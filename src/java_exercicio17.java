import java.util.*;
public class java_exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a profissão de Tiburcio ");

        System.out.println("E - Engenheiro");
        System.out.println("M - Medico");
        System.out.println("P - Programador");
        System.out.println("D - Designer");
        System.out.println("A - Advogado");
        String prof = sc.nextLine();


        switch(prof) {
            case "E":
                System.out.println("Tiburcio é um Engenheiro");
                break;

            case "M":
                System.out.println("Tiburcio é Medico");
                break;

            case "P":
                System.out.println("Tiburcio é um Programador");
                break;

            case "D":
                System.out.println("Tiburcio é um Designer");
                break;

            case "A":
                System.out.println("Tiburcio é um Advogado");
                break;

            default:
                System.out.println("Tiburcio é Desempregado");
                break;
        }
    }
}