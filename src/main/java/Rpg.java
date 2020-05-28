/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Souza Santana.
 *  @testes Ana Carolina.
 */
public class Rpg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  imunidade = 100, totalDado = 0, totalDado2 = 0;
        String nome, opcao;
        char respostaChar, opcao2;
        boolean gameOver = false;

        do {
            gameOver = false;
                    System.out.println("\n\t                    Rpg Compra sem Coronavírus");
                    System.out.println("\n\n\t                      ### Menu do jogo: ###");
                    System.out.println("\n\t                    ===========================");
                    System.out.println("\t                      |     1 - Jogar        |");
                    System.out.println("\t                      |     2 - Sair         |");
                      System.out.print("\n\t                          Opcão desejada: ");

            opcao = sc.nextLine();
            switch (opcao) {
                case "1":

                System.out.println("\n\n\t                     Bem vindo ao RPG Compra sem Coronavírus!  \n\t");
                System.out.println("         ----------------------------------------------------------------------------"
                                   +" \n\t|         Nesse jogo você terá a missão de ir até  o supermercado, fazer     |"
                                  + "\n\t|         compras  e voltar pra casa sem ser contaminado pelo Coronavírus.   |\n\t"
                                      + "|         Durante todo o percurso,  você receberá diversos desafios, alguns  |\n\t"
                                     + "|          relacionados à Matemática para Tecnologia da informação e outros  |\n\t"
                                     + "|                      no qual você contará com a sorte.                     |\n\t"
                                     + "|                 Vamos iniciar o jogo com 100 pontos de imunidade.          |\n\t"
                                     + "|          Para cada desafio vencido sua imunidade não sofrerá danos,        |\n\t"
                                    +  "|          porém se perder o desafio você perderá pontos de imunidade!       |\n\t"
                                     + "|          Nos desafios de azar, caso a sorte esteja ao seu lado,            |\n\t"
                                    +  "|                   também não sofrerá danos em sua imunidade,               |\n\t"
                                     + "|          Caso a sua imunidade chegue ao total de 0 (zero) pontos,          |\n\t"
                                     + "|              você irá contrair o Coronavírus e perderá o Game.             |\n\t"
                                     + "|                          Boa sorte e se cuide!!!                           |\n\t"
                                  + " ----------------------------------------------------------------------------");
                
                
                               
 
                    do {
                        System.out.print("\n\t Digite seu nome: ");
                        
                        nome = sc.nextLine();
                        System.out.print("\n\t Digite 's' para sim ");
                        System.out.print("\n\t Digite 'n' para não.");
                        System.out.print("\n\t Confirme: se o seu nome será " + nome + "?  S/N:  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N') {
                            System.out.println("\n\t Digite 's' ou 'S' para sim ");
                            System.out.println("\n\t Digite 'n' ou 'N' para não.");
                        }
                        sc.nextLine();
                    } while (respostaChar != 's' && respostaChar != 'S' );

                System.out.println("              -------------------------------------------------------------------------------------\n\t"
                            + "     |           "+ nome + ", sua mãe pede para que você vá até o supermercado                 \n\t"
                            + "     |                       comprar mantimentos básicos e álcool em gel.                   |\n\t"
                            + "     |          O supermercado mais próximo fica a duas quadras de distância da sua casa.   |\n\t"
                            + "     |          Antes de sair, sua mãe diz para você não se esquecer de pegar sua máscara.  |\n\t"
                            + "     |                    Infelizmente você não se lembra de onde a colocou.                |\n\t"
                            + "     |         Para conseguir se lembrar de onde a deixou, terá que responder uma pergunta, |\n\t"
                            + "     |        caso responda corretamente você ganhará um bônus de 10 pontos de imunidade.   |\n\t"
                            + "      -----------------------------------Pergunta------------------------------------------- \n\t"
                           + "\n\t O número 350 em decimal convertido para binário é: "
                            + "\n\n\t a)1 0101 1011"
                            + "\n\t b)1 1111 0010"
                            + "\n\t c)1 0101 1110"
                            + "\n\t d)1 0110 0110");
                
                
                    do {
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B'
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D') {
                            System.out.println("\n\t Digite uma opção válida.");
                        }
                    } while (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B'
                            && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D');

                    if (respostaChar == 'c' || respostaChar == 'C') {
                        imunidade += 10;
                        System.out.print("\n\t Parabéns reposta correta.");
                        System.out.print("\n\t Voce ganhou + 10  pontos de imunidade.");
                        System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");

                    } else {
                        System.out.print("\n\t Resposta incorreta.");
                        System.out.print("\n\t Voce não ganhou o bônus de imunidade .\n\t");
                    }

                    do {
                        System.out.println("      --------------------------------------------------------------------------------- \n\t"
                                + "     |                     Ao sair de casa, e andar por uma quadra,                    |\n\t"
                                + "     |                  você se depara com um comerciante ambulante,                   |\n\t"
                                + "     |               que lhe oferece álcool em gel a um preço acessível.               |\n\t"
                                + "     |         Sabendo que de acordo com as noticias o alcool esta em falta,           |\n\t"
                                + "     |  voce pode compra-lo ou pode simplesmente ignorá-lo e continuar seu percurso.   |\n\t"
                              + "      -----------------------------------Pergunta-------------------------------------- \n\t"
                                 + "\n\t Deseja comprar o Álcool em gel do comerciante? S/N  ");
                        System.out.print("\n\t Digite 's' para sim ");
                        System.out.print("\n\t Digite 'n' para não.");
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 'S' && respostaChar != 'n' && respostaChar != 'N') {
                            System.out.println("\n\t Digite 's' ou 'S' para sim ");
                            System.out.println("\n\t Digite 'n' ou 'N' para não.");
                        }
                    } while (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N');

                    if (respostaChar == 's' || respostaChar == 'S') {
                        imunidade -= 40;
                        System.out.println("\n\t      -------------------------------------------------------------\n\t"
                                +"     |     Você comprou o produto do vendedor, e acabou percebendo |\n\t"
                                +"     |        que ao utilizar, o porduto não era álcool em gel,    |\n\t"
                                +"     |              mas sim gel fixador para cabelo.               |\n\t"
                                +"      -------------------------------------------------------------\n\t");
                        System.out.println("\t Com isso você perde 40 pontos de imunidade");
                        System.out.println("\t A sua imunidade total é de " + imunidade + "\n\t");
                    } else {
                        System.out.println("\n\t      ----------------------------------------------------------\n\t"
                                + "     |    Você optou por não adquirir o produto do comerciante  |\n\t"
                                + "     |        e continua sua caminhada até o supermercado.      |\n\t"
                                +"      ----------------------------------------------------------\n\t");
                    }

                    System.out.println("              ------------------------------------------------------------------------------------------------ \n\t"
                            + "     |                             Você chegou ao supermercado!                                        |\n\t"
                            + "     |   Ao entrar, procura por um carrinho de compras, devido à situação das recentes contaminações,  |\n\t" 
                            + "     |            os supermercados estão dispondo funcionários para higienizar os carrinhos!           |\n\t"
                            + "     |       Voce percebe que quem esta higienizando os carrinhos é o seu amigo Jubileu.               |\n\t"
                            + "     |  Jubileu diz que só irá fazer isso  se você responder corretamente a pergunta.                  |\n\t"
                            + "      --------------------------------------------Pergunta-------------------------------------------- \n\t"
                            + "\n\t A soma dos 2 número binários (110 1100) e (10 0111) é :"
                            + "\n\n\t a) 0101 1011"
                            + "\n\t b) 1111 0010"
                            + "\n\t c) 0101 1110"
                            + "\n\t d) 1001 0011");
                    do {
                        System.out.print("\n\t Resposta: ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B'
                                && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D') {
                            System.out.println("\n\t Digite uma opção válida.");
                        }
                    } while (respostaChar != 'a' && respostaChar != 'A' && respostaChar != 'b' && respostaChar != 'B'
                            && respostaChar != 'c' && respostaChar != 'C' && respostaChar != 'd' && respostaChar != 'D');

                    if (respostaChar == 'd' || respostaChar == 'D') {
                        System.out.println("\n\t Parabéns reposta correta.");
                        System.out.println("\n\t Voce não perdeu pontos imunidade.");
                        System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");

                    } else {
                        imunidade -= 30;
                        System.out.println("\n\t Resposta incorreta.");
                        System.out.println("\n\t Com isso você perde 30 pontos de imunidade");
                       System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                    }

                    System.out.println("              --------------------------------------------------------------------------------------- \n\t"
                            + "     |                  Você seleciona todos os mantimentos básicos necessários,             |\n\t"
                            + "     |                    e se dirige ao caixa, para efetuar o pagamento você                |\n\t"
                            + "     |           opta por realiza-lo com o cartão por proximidade, porém o sistema           |\n\t" 
                            + "     |         está um pouco instável e para que funcione terá que contar com a sorte!       |\n\t"
                            + "     |        Jogue um dado de 6 (seis) vezes, se a somatória do resultado de todos os       |\n\t"
                            + "     |            lançamentos for igual a 18 pontos, você poderá realizar a compra,          |\n\t"
                            + "     |      caso contrário terá que utilizar cédulas de dinheiro para efetuar o pagamento    |\n\t"
                            + "      --------------------------------------------------------------------------------------- \n\t");

                     System.out.print("\n\t Digite 's' para sim ");
                     System.out.print("\n\t Digite 'n' para não.");
                     
                    do {
                        System.out.print("\n\t Preparado(a)? S/N  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N') {
                            System.out.println("\n\t Digite 's' ou 'S' para sim ");
                            System.out.println("\n\t Digite 'n' ou 'N' para não.");
                        }
                    } while (respostaChar != 's' && respostaChar != 's');

                    for (int i = 1; i < 7; i++) {
                        int num = new Random().nextInt(5) + 1;
                        System.out.print("\n\t Girando dado...");
                        System.out.print("\n\t " + i + "ª jogada:" + num + " ponto(s)");
                        totalDado2 += num;
                        System.out.print("\n\t---------------------");
                    }
                    System.out.println("\n\n\t Total de pontos foi: " + totalDado2);

                    if (totalDado2 < 18) {
                        imunidade -= 30;
                        if (imunidade < 0) {
                            imunidade = 0;
                            System.out.println("Sua imunidade chegou a Zero");
                            System.out.println("Você está infectado com o corona vírus");
                            System.out.println("Game Over!");
                            gameOver = true;
                            
                        }
                        System.out.println("\n\t Você não atingiu a pontuação minima,"
                                         + "\n\t Com isso você perde 30 pontos de imunidade");
                        System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                        
                        
                    }                 
                                
                    else {
                        System.out.println("\n\t Parabéns você atingiu a pontuação minima,"
                                         + "\n\t     pode continuar sua jornada!!!");
                        System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                    }

                    System.out.println("              ---------------------------------------------------------------------------------------- \n\t"
                            + "     |            Saindo do mercado, você avista uma mulher acenando e te chamando:             \n\t"
                            + "     |           " + nome + "'" + " , " + "'" + nome + "'" + " até que você reconhece.         \n\t"
                            + "     |           É sua tia Maria, que você não vê há alguns anos , chegando mais perto.        |\n\t"
                            + "     |            Você reapara que ela está sem máscara, espirrando e tossindo muito,          |\n\t"
                            + "     |       A sua única alternativa de evita-la é atravessar a rua e dar a volta para casa,   |\n\t"
                            + "     |          mas para isso  terá que contar com a sua sorte novamente, girando o dado!      |\n\t"
                            + "     |             O minimo para ganhar o desafio agora é 23 pontos. BOA SORTE!!               |\n\t"
                            + "      ---------------------------------------------------------------------------------------- \n\t" );
                    
                                                  
                                      
                    
                    do {
                         System.out.println("\n\t Digite 's' para sim ");
                            System.out.println("\n\t Digite 'n' para não.");
                        System.out.print("\n\t Preparado(a)? S/N  ");
                        respostaChar = sc.next().charAt(0);
                        if (respostaChar != 's' && respostaChar != 's' && respostaChar != 'n' && respostaChar != 'N') {
                            System.out.println("\n\t Digite 's' para sim ");
                            System.out.println("\n\t Digite 'n' para não.");
                        }
                    } while (respostaChar != 's' && respostaChar != 's');

                    for (int i = 1; i < 7; i++) {
                        int num = new Random().nextInt(5) + 1;
                        System.out.println("\n\t Girando dado...");
                        System.out.println("\n\t" + i + "ª jogada:" + num + " ponto(s)");
                        totalDado += num;
                        System.out.print("\n\t---------------------");
                        
                    }
                    System.out.println("\n\t Total de pontos foi: " + totalDado);

                    if (totalDado < 23) {
                        imunidade -= 30;
                        System.out.println("\n\t Você não atingiu a pontuação minima,"
                                + "\n\t Com isso você perde 30 pontos de imunidade");
                        if (imunidade < 0) {
                            imunidade = 0;
                            System.out.println("Sua imunidade chegou a Zero");
                            System.out.println("Você está infectado com o corona vírus");
                            System.out.println("Game Over!");
                            gameOver = true;
                            
                        }

                        System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                        
                    } else {
                        System.out.println("\n\t Parabéns você atingiu a pontuação minima,"
                                + "\n\t     pode continuar sua jornada!!!");
                        System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                    }
                    
                      

                    System.out.println("              ------------------------------------------------------------------------------------------------ \n\t"
                            + "     |                               Você chega em sua casa!!                                         |\n\t"
                            + "     |       Depois de tanta exposição, para se proteger completamente do vírus,                      |\n\t"
                            + "     | o recomendado é que você, ao entrar em casa higienize tudo o que trouxe da rua,                |\n\t"
                            + "     |                 retire a roupa utilizada e coloque para lavar,                                 |\n\t"
                            + "     | para fazer isso terá que passar pelo ultimo desafio, valendo 20 pontos de imunidade            |\n\t"
                            + "     |            preste bastante atenção e responda com cuidado sem pressa,                          |\n\t"
                            + "     |                                      boa sorte!!                                               |\n\t"
                            + "      --------------------------------------------Pergunta-------------------------------------------- \n\t"
                            +   "\n\n\t Dado o número 2020 em decimal, selecione qual opção contém ele convertido"
                            + "\n\t em Binário, Octal e Hexadecimal? Exatamente nessa sequência. Boa Sorte!!!! ");
                    System.out.println();
                    ArrayList<String> pergunta = new ArrayList<String>();

                    pergunta.add(0, "011111100100 3744 7E4");
                    pergunta.add(1, "011011100100 3774 8E4");
                    pergunta.add(2, "011111100100 5633 4C4");
                    pergunta.add(3, "000100110100 3744 7E4");
                    boolean resposta = false;
                    do {

                        System.out.println("\n\t A- " + pergunta.get(0));
                        System.out.println("\n\t B- " + pergunta.get(1));
                        System.out.println("\n\t C- " + pergunta.get(2));
                        System.out.println("\n\t D- " + pergunta.get(3));
                        System.out.print("\n\t Resposta: ");
                        opcao2 = sc.next().charAt(0);

                        switch (opcao2) {
                            case 'a':
                            case 'A':
                                if (pergunta.get(0).equals("\n\t 011111100100 3744 7E4")) {
                                    System.out.println("\n\t Resposta correta.");
                                    System.out.println("\n\t Não perdeu imunidade.");
                                                                        
                                    System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                } else {
                                    imunidade -= 20;
                                    System.out.print("\n\t Resposta incorreta.");
                                    System.out.print("\n\t Com isso você perde 20 pontos de imunidade");
                                     
                                                                   
                                    if (imunidade < 0) {
                                        imunidade = 0;
                                        System.out.println("\n\t Sua imunidade chegou a Zero");
                                        System.out.println("\n\t Você está infectado com o corona vírus");
                                        System.out.println("\n\t Game Over!");
                                        gameOver = true;
                                        
                                    }
                                    System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                }
                                break;
                            case 'b':
                            case 'B':
                                if (pergunta.get(1).equals("\n\t 011111100100 3744 7E4")) {
                                     System.out.println("\n\t Resposta correta.");
                                    System.out.println("\n\t Não perdeu imunidade.");
                                   System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                } else {
                                    imunidade -= 20;
                                    System.out.println("\n\t Resposta incorreta.");
                                    if (imunidade < 0) {
                                        imunidade = 0;
                                        System.out.println("\n\t Sua imunidade chegou a Zero");
                                        System.out.println("\n\t Você está infectado com o corona vírus");
                                        System.out.println("\n\t Game Over!");
                                        gameOver = true;
                                        
                                    }
                                     System.out.println("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                }
                                break;
                            case 'c':
                            case 'C':
                                if (pergunta.get(2).equals("\n\t 011111100100 3744 7E4")) {
                                     System.out.println("\n\t Resposta correta.");
                                    System.out.println("\n\t Não perdeu imunidade.");
                                    System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                } else {
                                    imunidade -= 20;
                                    System.out.println("\n\t Resposta incorreta.");
                                    if (imunidade < 0) {
                                        imunidade = 0;
                                        System.out.println("\n\t Sua imunidade chegou a Zero");
                                        System.out.println("\n\t Você está infectado com o corona vírus");
                                        System.out.println("\n\t Game Over!");
                                        gameOver = true;
                                        
                                    }
                                     System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                }
                                break;
                            case 'd':
                            case 'D':
                                if (pergunta.get(3).equals("\n\t 011111100100 3744 7E4")) {
                                     System.out.println("\n\t Resposta correta.");
                                    System.out.println("\n\t Não perdeu imunidade.");
                                     System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                } else {
                                    System.out.println("\n\t Resposta Incorreta");
                                    imunidade -= 20;
                                    
                                    if (imunidade < 0) {
                                        imunidade = 0;
                                        System.out.println("\n\t Sua imunidade chegou a Zero");
                                        System.out.println("\n\t Você está infectado com o corona vírus");
                                        System.out.println("\n\t Game Over!");
                                        gameOver = true;
                                        
                                    }
                                    System.out.print("\n\t A sua imunidade total é de " + imunidade + "\n\t");
                                    resposta = true;
                                }
                                break;

                            default:
                                System.out.println("\n\t Opção Inválida!");
                                break;

                        }

                        Collections.shuffle(pergunta);
                        Collections.shuffle(pergunta);
                        Collections.shuffle(pergunta);

                    } while (resposta == false);
                    
                    if (imunidade > 0){
                        System.out.println("\n\t Parabéns você efetuou suas compras,"
                                + "\n\t com total segurança, e voltou pra casa ileso!!");
                    }

                case "2":
                     gameOver = true;
                    
                                       
                    break;
                    
                                
                            
             
                            
                default:
                    System.out.println("\n\t Opção Inválida!");
                    break;
            }
        } while (imunidade >0 && !gameOver);
        
        
    }

}