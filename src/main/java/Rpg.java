
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Souza Santana
 */
public class Rpg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, imunidade = 100;
        String nome;
        
        
        
        System.out.println("\n\t Rpg Compra sem COVID-19");
        System.out.println("\n\n\t   ### Menu do jogo: ###");
		System.out.println("\n\t===========================");
		System.out.println("\t  |     1 - Jogar        |");
		System.out.println("\t  |     2 - Sair         |");
                
                opcao = sc.nextInt();
		switch (opcao) {
		case 1:
                    
                    System.out.println("\n\n\t     Bem vindo ao RPG Compra sem COVID-19");
                    System.out.println(" \n\t   Nesse jogo você terá a missão de ir ao mercado"
                    + "\n\tfazer compras e voltar pra casa sem contrair o COVID-19,\n\t"
                    + "no caminho de sua casa até o mercado e a volta,\n\t"
                    + "irão ter alguns desafios, você iniciara com 100 de imunidade,\n\t"
                    + "a cada desafio perdido você perderá imunidade,\n\t"
                    + "   chegando ao zero 'Game Over', boa sorte e se cuide.\n\t");
                    
                    System.out.println("Digite seu nome:");
                    nome = sc.nextLine();
                    nome = sc.nextLine();
                    
                    System.out.println("\t"+ nome + " sua mãe pede para que você vá no mercado"
                            + "\n\t comprar papel hihgiênico e álcool em gel,"
                            + "\n\t o mercado mais próximo fica a duas quadras de distâncias."
                            + "\n\t Antes que você saia sua mãe diz para você não esquecer "
                            + "\n\t de pegar sua máscara, porém você não lembra onde a colocou."
                            + "\n\n\n\t Para lembrar onde você colcou a máscara terá que responder uma pergunta,"
                            + "\n\t respondendo corretamente você ganhará um bonus de 15 pontos de imunidade."
                            + "\n\t -----------Pergunta----------"
                            + "\n\t O número 350 em casa decimal convertido para binário é: "
                            + "\n\t a)1 0101 1011"
                            + "\n\t b)1 1111 0010"
                            + "\n\t c)1 0101 1110"
                            + "\n\t d)1 0110 0110");
                    
			break;
		case 2:     
			break;
		default:                    
			System.out.println("Opção Inválida!");
                        break;
                }
                
    }
}
