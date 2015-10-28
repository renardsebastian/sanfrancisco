package model;

/**
 * Created by luis_ on 27/10/2015.
 */
public class Cena
{
    private Evidencia evidencia;
    //private Suspeito[] suspeitos;
    public String descricao;

    public Cena( String descricao, Evidencia evidencia){
        this.descricao = descricao;
        this.evidencia = evidencia;
    }

    /*public Suspeito selecionaSuspeito( int index )
    {
        return suspeitos[index];
    }
    public String interrogaSuspeito( Suspeito suspeito )
    {
        return suspeito.getDepoimento();
    }*/
    public String investigaCena()
    {

        if(evidencia != null)
        {
            return "Você encontrou uma evidência: "+evidencia.getDescricao();
        }
        else
        {
            return "Não foi encontrada nenhuma evidência.";
        }

    }
}
