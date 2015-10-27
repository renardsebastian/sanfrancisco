package model;

/**
 * Created by Renard on 27/10/2015.
 */
public class Suspeito extends NonPlayerCharacter
{
    public String depoimento;
    public Ficha ficha;

    public Suspeito(Ficha ficha, String depoimento)
    {
        this.ficha = ficha;
        this.depoimento = depoimento;
    }

    public String getDepoimento()
    {
        return this.depoimento;
    }
}
