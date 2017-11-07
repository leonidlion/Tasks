public class CustomList<T> {
    private Element<T> head, tail;

    public CustomList() {
        this.head = null;
        this.tail = null;
    }

    public void addToEnd(T data) {
        Element<T> newElement = new Element<>(data);
        if (head == null){
            head = newElement;
            tail = newElement;
        }else {
            tail.setNext(newElement);
            tail = newElement;
        }
    }

    public void addToStart(T data){
        Element<T> element = new Element<>(data);
        if (head == null){
            head = element;
            tail = element;
        }else {
            element.setNext(this.head);
            head = element;
        }
    }

    public String print() {
        StringBuilder outPut = new StringBuilder();
        while (head != null){
            outPut.append(head.getValue());
            head = head.getNext();
            if (head != null)
                outPut.append(" -> ");
        }
        return outPut.toString();
    }

    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();
        customList.addToEnd(1);
        customList.addToEnd(3);
        customList.addToEnd(5);
        customList.addToEnd(20);
        System.out.println(customList.print());
    }
}
