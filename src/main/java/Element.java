import com.sun.istack.internal.NotNull;

public final class Element<T> {
    private final T value;
    private Element next;

    public Element(@NotNull T value){
        this.value =  value;
    }

    public T getValue(){
        return value;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(@NotNull Element next) {
        if(hasNext()){
            throw new RuntimeException("Can't change initialized parameter 'next'");
        }else {
            this.next = next;
        }
    }

    public boolean hasNext(){
        return next!=null;
    }
}
