import java.util.Scanner;

public class E1_Lucasvolkweis{
    public static void main(String [] args){
        
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("A seguir, insira números de 1 a 10:");
        
        System.out.println("insira primeiro número de 1 a 10:");
        int num1 = scanner.nextInt();
        
        System.out.println("insira segundo número de 1 a 10:");
        int num2 = scanner.nextInt();
        
        System.out.println("insira terceiro número de 1 a 10:");
        int num3 = scanner.nextInt();
       
        System.out.println("insira quarto número de 1 a 10:");
        int num4 = scanner.nextInt();
        
        System.out.println("insira quinto número de 1 a 10:");
        int num5 = scanner.nextInt();
        
        int maior = num1;
        int menor = num1;
        int soma = num1;
        
        if (num2 > maior) {
            maior = num2;
        } else if (num2 < menor) {
            menor = num2;
        }
        soma += num2;
        
        if (num3 > maior) {
            maior = num3;
        } else if (num3 < menor) {
            menor = num3;
        }
        soma += num3;
        
        if (num4 > maior) {
            maior = num4;
        } else if (num4 < menor) {
            menor = num4;
        }
        soma += num4;
        
        if (num5 > maior) {
            maior = num5;
        } else if (num5 < menor) {
            menor = num5;
        }
        soma += num5;
        
        double media = (double) (soma - maior - menor) / 3;
        System.out.println("Média dos três números do meio: " + media);
        
        double mediaMenores = (double) (menor + menor) / 2;
        System.out.println("Média dos dois menores números: " + mediaMenores);
    }
}