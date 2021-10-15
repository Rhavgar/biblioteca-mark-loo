package biblioteca;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Emprestimo extends DomainObject
{
    private Date inicio;
    private Date previsaoEntrega;
    private Date entrega;
    private Publicacao publicacao;
    private Aluno aluno;

    public Emprestimo(long id, Date inicio, Date previsaoEntrega, Date entrega, Publicacao publicacao, Aluno aluno)
    {
        super(id);
        this.inicio = inicio;
        this.previsaoEntrega = previsaoEntrega;
        this.entrega = entrega;
        this.publicacao = publicacao;
        this.aluno = aluno;
    }
    
    public int obterDiasEmAtraso()
    {
        Date hoje = java.util.Calendar.getInstance().getTime();
        
        if(entrega.compareTo(hoje) < 0)
        {
            long diferenca = hoje.getTime() - entrega.getTime();
            int atraso = Math.toIntExact(TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS));
            
            return atraso;
        }
        
        return 0;
    }
}
