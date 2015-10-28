package model;

/**
 * Created by luis_ on 27/10/2015.
 */
public class Caso
{
    public String descricao;
    public Cena[ ] cenas;
    public Suspeito[ ] suspeitos;
    public Cena cenaInicial;
    public Suspeito culpado;

    public Caso(Cena[] c, Suspeito[] s, Suspeito culpado)
    {
        cenas = c;
        suspeitos = s;
        this.culpado = culpado;
    }

    public void resolveCaso(Suspeito suspeito)
    {
        if(suspeito == culpado)
        {
            //Ganha o jogo
        }
        else
        {
            //Perde o jogo
        }
    }
}