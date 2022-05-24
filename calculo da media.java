package exerciciossala;

import java.util.Scanner;

public class d2504e001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);//puxando impressora
        
        double ac1, ac2, ag, af;//declarando variaveis
        double media;//declarando variaveis
        
        System.out.print("Digite a nota de AC1: ");//imprimindo
        ac1 = ler.nextDouble();//recebendo
        
        System.out.print("Digite a nota de AC2: ");
        ac2 = ler.nextDouble();
        
        System.out.print("Digite a nota de AG: ");
        ag = ler.nextDouble();
        
        System.out.print("Digite a nota de AF: ");
        af = ler.nextDouble();
        
        media = ((ac1 * 1.5) + (ac2 * 3) + (ag * 1) + (af * 4.5))/4;//calculando
        
        if(media >= 5){//condição para aprovar ou reprovar
            System.out.print("Parabens, voce foi aprovado!");
        }else{
            System.out.print("Você foi reprovado");
        }
    }
    
}
