public class ZooManagementSystem {
    public static void main(String[] args) 
    {
        Mamifero tigre = new Mamifero("Tigre", 5, "Laranja");
        Ave aguia = new Ave("Aguia", 10, 2.5);
        Pinguim pinguim = new Pinguim("Pinguim", 3, 0.8);

        tigre.emitirSom();  
        aguia.emitirSom();  
        pinguim.emitirSom();  
        pinguim.nadando();  
    }
}