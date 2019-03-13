package navegador;

import java.util.EmptyStackException;

public interface Interface {
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public void push(String elemento);
    public String pop() throws EmptyStackException;
    public String top() throws EmptyStackException;
}
