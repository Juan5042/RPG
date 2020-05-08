
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
        int opcao, imunidade = 100 ,totalDado = 0, totalDado2= 0, gameOver = 0;
        String nome;
        char respostaChar;
        
        
        do {
            
        System.out.println("\n\t Rpg Compra sem Corona Vírus");
        System.out.println("\n\n\t   ### Menu do jogo: ###");
		System.out.println("\n\t===========================");
		System.out.println("\t  |     1 - Jogar        |");
		System.out.println("\t  |     2 - Sair         |");
                System.out.print("\n\t Opcão desejada: ");
                
                opcao = sc.nextInt();
		switch (opcao) {
		case 1:
                    
                    System.out.println("\n\n\t     Bem vindo ao RPG Compra sem Corona Vírus");
                    System.out.println(" \n\t   Nesse jogo você terá a missão de ir ao mercado"
                    + "\n\tfazer compras e voltar pra casa sem contrair o Corona Vírus,\n\t"
                    + "no caminho de sua casa até o mercado e a volta,\n\t"
                    + "irão ter alguns desafios envolvendo a matéria Matemática para Tecnologia da informação \n\t"
                    + " e alguns envolvento a sorte, você iniciara com 100 de imunidade,\n\t"
                    + "a cada desafio perdido você perderá imunidade,\n\t"
                    + "   chegando ao zero 'Game Over', boa sorte e se cuide.\n\t");
                    
                    System.out.print("\n\t Digite seu nome:");
                    nome = sc.nextLine();
                    nome = sc.nextLine();
                    
                    System.out.println("\n\t "+ nome + " sua mãe pede para que você vá no mercado"
                            + "\n\t comprar papel hihgiênico e álcool em gel,"
                            + "\n\t o mercado mais próximo fica a duas quadras de distâncias."
                            + "\n\t Antes que você saia sua mãe diz para você não esquecer "
                            + "\n\t de pegar sua máscara, porém você não lembra onde a colocou."
                            + "\n\n\n\t Para lembrar onde você colcou a máscara terá que responder uma pergunta,"
                            + "\n\t respondendo corretamente você ganhará um bonus de 15 pontos de imunidade."
                            + "\n\n\t -----------Pergunta----------"
                            + "\n\t O número 350 em casa decimal convertido para binário é: "
                            + "\n\t a)1 0101 1011"
                            + "\n\t b)1 1111 0010"
                            + "\n\t c)1 0101 1110"
                            + "\n\t d)1 0110 0110");
                    
                    do {
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D'){
                        System.out.println("\n\t Digite uma opção válida.");
                    }
                    }while (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D');
                    
                    if (respostaChar == 'c' || respostaChar == 'C'){
                        imunidade += 15;
                        System.out.println("\n\t Parabéns reposta correta.");
                        System.out.println("\n\t Vc ganhou + 15 de imunidade.");
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                        
                    }else {
                        System.out.println("\n\t Resposta incorreta.");
                        System.out.println("\n\t Imunidade não ganhou bônus.");
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
                    
                    
                    System.out.println("\n\t Você então adentra no mercado pronto para fazer suas compras,"
                            + "\n\t e procura uma cestinha para colocar os produtos que serão comprados,"
                            + "\n\t tem um funcionário na frente da cestinha, higienizando a mão dos clientes"
                            + "\n\t antes de eles pegarem a cestinha, chegando mais perto você o reconhce,"
                            + "\n\t é o Jubileu seu amigo da faculdade, Jubileu então diz que só irá "
                            + "\n\t passar álcool em gel na sua mão se você responder corretamente a pergunta."
                            + "\n\n\t -----------Pergunta----------"
                            + "\n\n\t A soma dos 2 número binários (110 1100) e (10 0111) é :"
                            + "\n\t a) 0101 1011"
                            + "\n\t b) 1111 0010"
                            + "\n\t c) 0101 1110"
                            + "\n\t d) 1001 0011");
                    do {
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D'){
                        System.out.println("\n\t Digite uma opção válida.");
                    }
                    }while (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D');
                    
                    if (respostaChar == 'd' || respostaChar == 'D'){
                        System.out.println("\n\t Parabéns reposta correta.");
                        System.out.println("\n\t Não perdeu imunidade.");
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                        
                    }else {
                        imunidade -= 20;
                        System.out.println("\n\t Resposta incorreta.");
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                    }
                    
                    System.out.println("\n\t Você então vai a procura dos seus produtos,"
                            + "\n\t com eles na cestinha você caminha para o caixa,"
                            + "\n\t você começa a colocar as compras na esteira, a mulher pergunta "
                            + "\n\t se você deseja CPF na na nota, você prefere que não,"
                            + "\n\t para evitar tocar na máquina de cartão, onde muitos passam a mão,"
                            + "\n\t porém o seu pagamento será realizado com cartão, por sorte"
                            + "\n\t você tem um cartão que é por proximidade, sem a necessidade de senhas,"
                            + "\n\t porém a operadora de caixa lhe informa que a funcção por proximidade "
                            + "\n\t vem apresentando alguns defeitos, então você contará "
                            + "\n\t com a sorte, terá que girar 6 vezez um dado de 6 lados, "
                            + "\n\t a pontuação minima será de 18 pontos, boa sorte!! ");
                    
                    do {
                        System.out.print("\n\t Preparado(a)? S/N  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N'){
                        System.out.println("\n\t Digite 's' ou 'S' para sim ");
                        System.out.println("\n\t Digite 'n' ou 'N' para não.");
                    }
                    }while (respostaChar != 's' && respostaChar != 's' );
                    
                    
                    for (int i = 1; i < 7; i++) {
                    int num = new Random().nextInt(5) + 1;
                    System.out.println("\n\t Girando dado...");
                    System.out.println("\n\t" + i + "ª jogada:" +num);
                    totalDado2 += num;
                    }
                    System.out.println("\n\t Total de pontos foi: " + totalDado2);
                    
                    if (totalDado2 < 18){
                        imunidade -= 30;
                        System.out.println("\n\t Você não atingiu a pontuação minima,"
                                + "\n\t com isso você perdeu 30 pontos de imunidade.");
                        System.out.println("\n\t Imunidade total: "+ imunidade);
                    }else{
                        System.out.println("\n\t Parabéns você atingiu a pontuação minima,"
                                + "\n\t pode continuar sua jornada tranquilo");
                        System.out.println("\n\t Imunidade total: "+ imunidade);
                    }
                    
                    System.out.println("\n\t Saindo do mercado, uma quadra depois,"
                            + "\n\t você avista uma mulher acenando para você e te chamando: "
                            + "'" +nome +"'"+ " , "+ "'"+ nome +"'"+ " até que você reconhece."
                            + "\n\t É sua tia Gertrudes, que você não vê a mais de 5 anos, chegando mais perto,"
                            + "\n\t você reapara que ela está sem máscara, espirrando e tossindo muito,"
                            + "\n\t além disso com a aparência de doente."
                            + "\n\t Pois bem a sua única alternativa de evita-la é atravessar a rua e dar a volta "
                            + "\n\t e seguir para casa tranquilamente, para isso você terá que contar"
                            + "\n\t com a sua sorte novamente, girando o dado, porém o minimo para"
                            + "\n\t ganhar o desafio agora é 23 pontos, boa sorte!! ");
                    do {
                        System.out.print("\n\t Preparado(a)? S/N  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N'){
                        System.out.println("\n\t Digite 's' ou 'S' para sim ");
                        System.out.println("\n\t Digite 'n' ou 'N' para não.");
                    }
                    }while (respostaChar != 's' && respostaChar != 's' );
                    
                    
                    for (int i = 1; i < 7; i++) {
                    int num = new Random().nextInt(5) + 1;
                    System.out.println("\n\t Girando dado...");
                    System.out.println("\n\t" + i + "ª jogada:" +num);
                    totalDado += num;
                    }
                    System.out.println("\n\t Total de pontos foi: " + totalDado);
                    
                    if (totalDado < 23){
                        imunidade -= 30;
                        System.out.println("\n\t Você não atingiu a pontuação minima,"
                                + "\n\t com isso você perdeu 30 pontos de imunidade.");
                        if (imunidade < 0){
                        imunidade = 0;
                        }
                        System.out.println("\n\t Imunidade total: "+ imunidade);
                    }else{
                        System.out.println("\n\t Parabéns você atingiu a pontuação minima,"
                                + "\n\t pode continuar sua jornada tranquilo");
                        System.out.println("\n\t Imunidade total: "+ imunidade);
                    }
                    
                    
                    System.out.println("\n\t Você anda mais uma quadra e chega em sua casa, o próximo"
                            + "\n\t desafio se na vida real afetaria não só você, mas todos que moram com você,"
                            + "\n\t porém como aqui é só um jogo, somente você sofrerá as consequências."
                            + "\n\n\t Você ficou muito tempo fora de casa, exposto de várias formas,"
                            + "\n\t para se proeger completamente do vírus, o recomendado é que você,"
                            + "\n\t ao entrar em casa higienize tudo o que trouxe da rua, retire a "
                            + "\n\t roupa utilizada e a ponha pra lavar, para que você faça esse procedimento"
                            + "\n\t você terá que passar pelo ultimo desafio, mais uma pergunta relacionada"
                            + "\n\t a matéria escolhida, valendo 20 pontos de imunidade preste"
                            + "\n\t bastante atenção e responda com cuidado sem pressa, boa sorte!!"
                            + "\n\n\t -----------Pergunta----------"
                            + "\n\n\t Dado o número 2020 em decimal, selecione qual opção contém ele convertido"
                            + "\n\t em Binário, Octal e Hexadecimal? Boa Sorte!!!! ");
                            System.out.print("\n\t a) 011111100100 3744 7E4 "); 
                            System.out.print("\n\t b) 011011100100 3774 8E4 "); 
                            System.out.print("\n\t c) 011111100100 5633 4C4 "); 
                            System.out.print("\n\t d) 000100110100 3744 7E4 ");
                    
                    do {
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D'){
                        System.out.println("\n\t Digite uma opção válida.");
                    }
                    }while (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B' 
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D');
                    
                    if (respostaChar == 'a' || respostaChar == 'A'){
                        System.out.println("\n\t Parabéns reposta correta.");
                        System.out.println("\n\t Não perdeu imunidade.");
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                        
                    }else {
                        imunidade -= 20;
                        System.out.println("\n\t Resposta incorreta.");
                        if (imunidade < 0){
                        imunidade = 0;
                        }
                        System.out.println("\n\t Imunidade total é de "+ imunidade);
                    }
                    
  
		case 2:     
                    imunidade = 0;
			break;
		default:                    
			System.out.println("\n\t Opção Inválida!");
                        break;
                }
        }while (imunidade != 0 );
        
    }

}