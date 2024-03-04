package Queue;

public class Queue {

    private int queueLength;
    private int queue[];
    private int front;
    private int back;

    public Queue(int queueLength){
        this.queueLength = queueLength;
        queue = new int[queueLength];
        front = -1;
        back = -1;
    }
    boolean isFull(){
        return (back == queueLength - 1);
    } // проверка на заполненость
    boolean isEmpty(){ // проверка на пустоту
        if(front == -1 && back == -1){
            return true;
        } else {
            return false;
        }
    }
    void insert(int itemValue) { // заполнение очереди
        if(isFull()){
            throw new RuntimeException("Очередь заполнена");
        } else if(front == -1 && back == -1){
            front = back = 0;
            queue[back] = itemValue;
        } else{
            back++;
            queue[back] = itemValue;
        }
    }
    void remove(){ // удаление
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back){
            front = back = -1;
        } else {
            front++;
        }
    }
    void display(){ // вывод
        if(isEmpty()){
            throw  new RuntimeException("Очередь пуста");
        } else {
            for(int i = front; i <= back; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public int element(){ // просмотр заголовка очереди
        return queue[front];
    }
}
