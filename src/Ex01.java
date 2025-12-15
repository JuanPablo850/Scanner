import java.util.Scanner;
public class Ex01 {public static void main(String[] args) throws Exception {
    //Crie um menu:
    //1 - Somar
    //2 - Subtrair
    //3 - Multiplicar
    //4 - Dividir
    //O usuário escolhe uma opção e digita dois números.

    int n1, n2, res, opcao;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Escolha uma opção.");
    System.out.println("1 - Somar");
    System.out.println("2 - Subtrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    opcao = scan.nextInt();

    switch (opcao){
        case 1:
            System.out.print("Digite um número para somar: ");
            n1 = scan.nextInt();
            System.out.print("Digite outro número para somar: ");
            n2 = scan.nextInt();
            res = n1 + n2;
            System.out.printf("A soma de %d + %d é igual a %d",n1,n2,res);
            break;
        case 2:
            System.out.print("Digite um número para subtrair: ");
            n1 = scan.nextInt();
            System.out.print("Digite outro número para subtrair: ");
            n2 = scan.nextInt();
            res = n1 - n2;
            System.out.printf("A subtração de %d - %d é igual a %d",n1,n2,res);
            break;
        case 3:
            System.out.print("Digite um número para multiplicar: ");
            n1 = scan.nextInt();
            System.out.print("Digite outro número para multiplicar: ");
            n2 = scan.nextInt();
            res = n1 * n2;
            System.out.printf("A multiplicação de %d x %d é igual a %d",n1,n2,res);
            break;
        case 4:
             System.out.print("Digite um número para dividir: ");
            n1 = scan.nextInt();
            System.out.print("Digite outro número para dividir: ");
            n2 = scan.nextInt();
            res = n1 / n2;
            System.out.printf("A divisão entre %d / %d é igual a %d",n1,n2,res);
            break;
        default:
            System.out.println("Digite uma opção válida.");
            break;
    }
}
}
