public class Ave extends Animal 
{
    protected double tamanhoAsa;

    public Ave(String nome, int idade, double tamanhoAsa) 
    {
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }

    public void emitirSom() 
    {
        System.out.println("Som de ave");
    }
}
