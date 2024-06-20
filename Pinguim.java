public class Pinguim extends Ave implements Nadador 
{
    public Pinguim(String nome, int idade, double tamanhoAsa) 
    {
        super(nome, idade, tamanhoAsa);
    }

    public void emitirSom() 
    {
        System.out.println("Pinguim grasnando");
    }

    public void nadando() 
    {
        System.out.println("Pinguim nadando");
    }
}