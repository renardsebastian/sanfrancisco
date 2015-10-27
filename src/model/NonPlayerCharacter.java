package model;

public class NonPlayerCharacter {
    private Ficha ficha;
    public NonPlayerCharacter(Ficha ficha)
    {
        this.ficha = ficha;
    }

    public Ficha getFicha()
    {
        return this.ficha;
    }
}
