public class Mamifero extends Animal 
{
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) 
    {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public void emitirSom() 
    {
        System.out.println("Som de mamífero");
    }
}
