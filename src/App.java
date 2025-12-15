import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        final int MEDIA = 60;
        int nota1, nota2, nota3, nota4, notaMax;
        String nome, res;

        System.out.print("Digite o nome do aluno:");
        nome = scan.next();

        System.out.print("Digite a primeira nota:");
        nota1 = scan.nextInt();

        System.out.print("Digite a segunda nota:");
        nota2 = scan.nextInt();

        System.out.print("Digite a terceira nota:");
        nota3 = scan.nextInt();

        System.out.print("Digite a quarta nota:");
        nota4 = scan.nextInt();

        notaMax = nota1 + nota2 + nota3 + nota4;
        
        if(notaMax >= MEDIA){
            res="aprovado";
        }else if (notaMax >= 40){
            res="recuperação";
        }else{
            res="reprovado";
        }
        System.out.printf("O aluno %s foi %s com uma nota de %d",nome,res,notaMax);
        
            
        }
    }

