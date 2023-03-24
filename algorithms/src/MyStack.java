import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item){
        stack.add(item);
    }
    public T pop(){
        if(stack.isEmpty()){
            return null;
        }
        int len = stack.size();
        return stack.remove(len - 1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
