package biblioteca;

public abstract class DomainObject
{
    private final long id;

    public DomainObject(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
    
}
