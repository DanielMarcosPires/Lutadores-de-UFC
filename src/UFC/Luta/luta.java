package UFC.Luta;

import UFC.Lutador.Lutador;

import java.util.Random;
import java.util.Scanner;

public class luta {
    public Lutador lutador;
    public Lutador lutador2;


    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getIdadePermitido()==false && l2.getIdadePermitido()==false){
            System.out.println("Luta marcado!");
            l1.setLutaMarcado(true);
            l2.setLutaMarcado(true);
            comecarLuta(l1,l2);
        }else{
            System.out.println("Menor de idade não pode participar de uma luta");
        }
    }

    public void comecarLuta(Lutador l1, Lutador l2){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Começar uma luta (0):sim (1): não");
            int escolha = scanner.nextInt();
            switch (escolha){
                case(0):lutando(l1,l2);break;
                case(1):break;
            }
        }
    }
    public void lutando(Lutador l1, Lutador l2){
        Random random = new Random();
        int resultado = random.nextInt(3);
        System.out.println(resultado);
        switch (resultado){
            case(0):
                System.out.println(l1.getNome()+"ganhou");
                l1.setVitorias(1);
                l2.setDerrotas(1);
                break;
            case(1):
                System.out.println(l2.getNome()+"ganhou");
                l2.setVitorias(1);
                l1.setDerrotas(1);
                break;
            case(2):System.out.println("Ambos empataram");break;
        }
    }
}
