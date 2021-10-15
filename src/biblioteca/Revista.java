package biblioteca;

public class Revista extends Publicacao
{
    private int periodicidadeEmDias;

    public Revista(long id, String titulo, int numExemplares, Area area, int periodicidadeEmDias)
    {
        super(id, titulo, numExemplares, area);
        this.periodicidadeEmDias = periodicidadeEmDias;
    }
    
}
