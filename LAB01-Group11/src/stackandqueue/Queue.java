package stackandqueue;

class Queue<T> {

    private int front, rear;
    private final int capacity;
    private final Object[] arr;
    private int count;
    Queue(int size) {

        front = 0;
        rear = -1;
        count = 0;
        arr= new Object[size];
        capacity = size;
    }
    public T dequeue()
    {
        if (isEmpty()) {
            System.out.println("Stack Is Empty Already..\n");
            return null;
        }
        T val = (T)arr[front];
        System.out.println("Removing " + val);
        front = (front + 1) % capacity;
        count--;
        return val;
    }
    public void enqueue(T item)
    {
        if (isFull())
            System.out.println("Sorry The Queue Is Full..");
        else {
            System.out.println("Inserting " + item);
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
        }
    }
    public T peek()
    {
        if (isEmpty())
            return null;
        return (T)arr[front];
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }
}