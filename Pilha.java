package navegador;

import java.util.EmptyStackException;

public class Pilha implements Interface{
    
    public String sites[];
    public int topo;
    

    public Pilha() {
        sites = new String[topo];
        topo = sites.length-1;
    }


    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo == sites.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public void push(String elemento) {
        if (!isFull()) {
            topo++;
            sites[topo] = elemento;
        }
    }

  @Override
    public String pop() throws EmptyStackException {
        if (!isEmpty()) {
            String retorno = sites[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    @Override
    public String top() throws EmptyStackException {
        if (!isEmpty()) {
            return sites[topo];
        }
        throw new EmptyStackException();
    }
}
