package stackandqueue;


public class Stack<T> {
        private final Object[] arr;
        private int top;
        private final int capacity;
        Stack(int size) {
                arr = new Object[size];
                capacity = size;
                top = -1;
        }
        public void push(T x) {

                if (isFull())
                        System.out.println("Sorry The Stack Is Full..\n");
                else {
                        System.out.println("Inserting Value: " + x);
                        arr[++top] = x;
                }
        }

        public T pop() {

                if (isEmpty()) {
                        System.out.println("Stack Is Empty Already..\n");
                        return null;
                }
                else {
                        System.out.println("Removing Value: " + peek());
                        T value = (T) arr[top];
                        top--;
                        return value;
                }
        }
        public int size() {
                return top + 1;
        }
        public boolean isEmpty() {
                return top == -1;
        }
        public boolean isFull() {
                return top == capacity - 1;
        }
        public T peek() {
                if (!isEmpty())
                        return (T)arr[top];
                return null;
        }
}
