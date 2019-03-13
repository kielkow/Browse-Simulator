package navegador;

public class Navegador {


    public static void main(String[] args) {
       Pilha p = new Pilha();
       
        System.out.println(p.size());
        System.out.println(p.topo);
        System.out.println(p.isFull());
        System.out.println(p.isEmpty());
    }
    
}
