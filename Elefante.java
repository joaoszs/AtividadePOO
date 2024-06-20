public class Elefante extends Mamifero 
{
    public Elefante(String nome, int idade, String corPelo) 
    {
        super(nome, idade, corPelo);
    }

    public void emitirSom() 
    {
        System.out.println("Elefante barritando");
    }
}