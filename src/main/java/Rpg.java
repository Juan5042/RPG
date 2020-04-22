
import java.util.Random;
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
        int opcao, imunidade = 100,totalDado = 0;;
        String nome, respostaString,gameOver = "n";
        char respostaChar;
        
        
        do {
        System.out.println("\n\t Rpg Compra sem Corona Vírus");
        System.out.println("\n\n\t   ### Menu do jogo: ###");
		System.out.println("\n\t===========================");
		System.out.println("\t  |     1 - Jogar        |");
		System.out.println("\t  |     2 - Sair         |");
                
                opcao = sc.nextInt();
		switch (opcao) {
		case 1:
                    
                    System.out.println("\n\n\t     Bem vindo ao RPG Compra sem Corona Vírus");
                    System.out.println(" \n\t   Nesse jogo você terá a missão de ir ao mercado"
                    + "\n\tfazer compras e voltar pra casa sem contrair o Corona Vírus,\n\t"
                    + "no caminho de sua casa até o mercado e a volta,\n\t"
                    + "irão ter alguns desafios, você iniciara com 100 de imunidade,\n\t"
                    + "a cada desafio perdido você perderá imunidade,\n\t"
                    + "   chegando ao zero 'Game Over', boa sorte e se cuide.\n\t");
                    
                    System.out.print("Digite seu nome:");
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
                    System.out.print("Resposta: ");
                    respostaChar = sc.next().charAt(0);
                    
                    if (respostaChar == 'c' || respostaChar == 'C'){
                        imunidade += 15;
                        System.out.println("\n\t Parabéns reposta correta.");
                        System.out.println("\n\t Vc ganhou + 15 de imunidade.");
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                        
                    }else {
                        System.out.println("\n\tResposta incorreta.");
                        System.out.println("\n\tImunidade não ganhou bônus.");
                    }
                    
                    do{
                    System.out.println("\n\t Você então agora sai de casa e anda uma quadra"
                            + "\n\t quando se depara com um rapaz na rua, ele olha pra vc, te chama"
                            + "\n\t e abre um blazer que ele vestia e te oferece um pote de "
                            + "\n\t álcool em gel por apenas 10 reais, você para e pensa."
                            + "\n\t 'Se comprar o álcool em gel agora eu ja garanto, pois sei que "
                            + "\n\t o álcool em gel está em falta em vários estabelecimentos,"
                            + "\n\t porém também existe a possibilidade do produto não ter"
                            + "\n\t a qualidade e eficácia requerida para o combate do Corona Vírus'.");
                    System.out.print("\n\t Você comprar o álcool em gel? S/N  ");
                    respostaChar = sc.next().charAt(0);
                    if (respostaChar != 's' && respostaChar != 'S' && respostaChar != 'n' && respostaChar != 'N'){
                        System.out.println("\n\t Digite 's' ou 'S' para sim ");
                        System.out.println("\n\t Digite 'n' ou 'N' para não.");
                    }
                    }while (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N' );
                    
                    if (respostaChar == 's'|| respostaChar == 'S'){
                        imunidade -= 30;
                        System.out.println("\n\t Você comprou o produto do vendedor, e acabou percebendo"
                                + "\n\t que quando foi utilizar, o porduto não era álcool em gel,"
                                + "\n\t mas sim gel fixador para cabelo.");
                        System.out.println("\t Com isso você perdeu 30 de imunidade");
                        System.out.println("\t Imunidade total é de "+imunidade);
                    }else{
                        System.out.println("\n\tVocê decide não comprar o produto do rapaz"
                                + "\n\t e continua sua caminhada até o supermercado.");
                    }
                    
                    System.out.println("\n\t Andando mais um pouco, a poucos metros do mercado,"
                            + "\n\t você avista uma mulher acenando para você e te chamando: "
                            + "'" +nome +"'"+ " , "+ "'"+ nome +"'"+ " até que você reconhece."
                            + "\n\t É sua tia Gertrudes, que você não vê a mais de 5 anos, chegando mais perto,"
                            + "\n\t você reapara que ela está sem máscara,e espirrando e tossindo muito,"
                            + "\n\t além disso com a aparência de doente."
                            + "\n\t Pois bem a sua única alternativa de evita-la é atravessar a rua e dar a volta "
                            + "\n\t e entrar no merccado pela rua do lado, para isso você terá que contar"
                            + "\n\t com a sua sorte, girando 6 vezez um dado de 6 lados,"
                            + "\n\t o mínimo de pontos para ganhar o desafio é 18 pontos. ");
                    do {
                        System.out.print("\n\tPreparado(a)? S/N  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N'){
                        System.out.println("\n\t Digite 's' ou 'S' para sim ");
                        System.out.println("\n\t Digite 'n' ou 'N' para não.");
                    }
                    }while (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N' );
                    System.out.println("\n\tGirando dado...");
                    
                    for (int i = 1; i < 7; i++) {
                    int num = new Random().nextInt(5) + 1;
                    System.out.println(i + "ª jogada:" +num);
                    totalDado += num;
                    }
                    System.out.println("\n\t Total de pontos foi: " + totalDado);
                    
                    if (totalDado < 18){
                        imunidade -= 20;
                        System.out.println("\n\t Você não atingiu a pontuação minima,"
                                + "\n\t com isso você perdeu 30 pontos de imunidade.");
                        System.out.println("\n\t Imunidade total: "+ imunidade);
                    }else{
                        System.out.println("\n\t Parabéns você atingiu a pontuação minima,"
                                + "\n\t pode continuar sua jornada tranquilo");
                    }
                    
                    
                    
                    
                    gameOver = "s";
			break;
		case 2:     
			break;
		default:                    
			System.out.println("Opção Inválida!");
                        break;
                }
        }while (imunidade > 0 && gameOver != "s" );
    }
}
