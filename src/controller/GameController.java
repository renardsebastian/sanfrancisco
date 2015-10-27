package controller;
import model.*;

/**
 * Created by Renard on 27/10/2015.
 */
public class GameController {

    private static GameController instance;
    private Caso caso; //Um caso � composto por um conjunto de cenas e suspeitos

    private GameController(){
    }

    public Caso getCaso(){
        return this.caso;
    }

    //Singleton
    public static GameController getInstance() {
        if (instance == null) instance = new GameController();
        return instance;
    }

    //Debrief � um resumo do caso e contexto em que o nosso investigador estar� situado
    public void showDebrief(){
        String debrief = "Seu amigo J.Peterman comprou recentemente, em um leil�o,";
        System.out.println(debrief);
    }

    public void inicializaCaso(){
        Suspeito suspeitos[] = {
                new Suspeito(new Ficha("Madruga",48,"ex-lutador de boxe; aposentado;","Madruga prefere acordar tarde. Apesar de ser uma pessoa culta e ter uma l�bia impressionante parece n�o conseguir escapar das pancadas que a vida lhe d�. N�o consegue trabalho e vive de favor com seu primo JP"), "Uma vergonha! Aposto que foi aquele morto de fome do chaves. Estava consertando o ar-condicionado da cozinha."),
                new Suspeito(new Ficha("Elaine",30,"redatora","Elaine � namorada de J.P."),"O que est� de errado com as pessoas, hoje em dia? \n Eu estava alisando o cabelo no banheiro de visitas quando tudo aconteceu"),
                new Suspeito(new Ficha("Furtado",35,"jardineiro","Come�ou a trabalhar recentemente como jardineiro na residencia de J.P. Possui um �timo relacionamento com o patr�o"),"Aposto que tenha sido aquele encostado do Madruga. \nEstava assistindo o jogo do Botafogo na hora em que o tal bolo foi roubado."),
                new Suspeito(new Ficha("Florinda",35,"cozinheira","Funcion�ria mais antiga na casa de J.P. Est� endividada desde a �ltima viagem que fez a Acapulco, no come�o do ano."),"N�o fa�o ideia de quem tenha sido o respons�vel. \nEstava cozinhando.")
        };
        Cena cenas[] = {
                new Cena("varanda",null),
                new Cena("sala de leitura",new Evidencia("�leo nas teclas do cofre", "Utilizando uma lanterna, voc� percebe que algu�m passou uma fina camada de �leo, impercept�vel ao olhar desatento nas teclas do painel do cofre. Provavelmente atrav�s de algum tipo de um spray")),
                new Cena("quarto de h�spedes", null),
                new Cena("cozinha",null),
                new Cena("banheiro de visitas", new Evidencia("Spray fixador para cabelos","pode ter sido utilizado para marcar as teclas digitadas no teclado do cofre")),
                new Cena("sala de estar", null),
                new Cena("�rea externa", new Evidencia("carteira", "carteira do jardineiro Furtado. Nela voc� v� a carteirinha de s�cio torcedor do Botafogo"))
        };

        this.caso = new Caso(cenas,suspeitos,suspeitos[2]);
    }

}
