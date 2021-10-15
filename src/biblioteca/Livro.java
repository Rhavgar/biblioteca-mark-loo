package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro extends Publicacao
{
    private String ISBN;
    private List<Autor> autor = new ArrayList<>();

    public Livro(long id, String titulo, int numExemplares, Area area, String ISBN)
    {
        super(id, titulo, numExemplares, area);
        this.ISBN = ISBN;
    }
    
    public void adicionarAutor(Autor autor)
    {
        this.autor.add(autor);
    }
    
    public void removerAutor(Autor autor)
    {
        this.autor.remove(autor);
    }
    
}
